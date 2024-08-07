package my.bookstore.controllers;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercewebservicescommons.dto.user.UserWsDTO;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import de.hybris.platform.webservicescommons.mapping.FieldSetLevelHelper;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "Customers")
@RequestMapping("/{baseSiteId}/")
public class CustomerController {
   /* private final DataMapper dataMapper;

    public CustomerController( DataMapper dataMapper) {
         this.dataMapper = dataMapper;
    }
    
    @RequestMapping(value = "/getUserProfile", method = RequestMethod.GET)

    @ResponseBody

    public UserWsDTO getUserProfile(@PathVariable

                                    final String baseSiteId, final String uid)

    {

        final CustomerData customerData = UserFacade.getCustomerUID(uid);

        return dataMapper.map(customerData, UserWsDTO.class, "BASIC");

    }*/
}
