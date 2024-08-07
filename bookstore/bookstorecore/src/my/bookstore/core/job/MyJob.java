package my.bookstore.core.job;


import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import my.bookstore.core.model.MyCronJobModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class MyJob extends AbstractJobPerformable<MyCronJobModel> {

    @Autowired
    private ModelService modelService;

    @Autowired
    private FlexibleSearchService flexibleSearchService;  // Inject FlexibleSearchService

    @Override
    public PerformResult perform(final MyCronJobModel cronJob) {
        final int minCartAge = cronJob.getMinCartAge();
        final Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -minCartAge);
        final Date cutoffDate = calendar.getTime();

        // Use FlexibleSearch to get carts older than the cutoffDate
        String query = "SELECT {PK} FROM {Cart} WHERE {saveTime} < ?cutoffDate";
        FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
        fsq.addQueryParameter("cutoffDate", cutoffDate);

        List<CartModel> cartsToDelete = flexibleSearchService.<CartModel>search(fsq).getResult();

        for (CartModel cart : cartsToDelete) {
            try {
                modelService.remove(cart);
            } catch (ModelNotFoundException e) {
                // Handle exception
                e.printStackTrace();
            }
        }

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    @Override
    public boolean isAbortable() {
        return true;  // Making the job abortable
    }
}
