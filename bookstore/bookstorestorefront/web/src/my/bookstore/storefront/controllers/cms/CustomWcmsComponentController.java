package my.bookstore.storefront.controllers.cms;

import javax.servlet.http.HttpServletRequest;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import my.bookstore.core.model.CustomWcmsComponentModel;
import my.bookstore.storefront.controllers.ControllerConstants;
@Controller("CustomWcmsComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.CustomWcmsComponent)
public class CustomWcmsComponentController extends AbstractCMSComponentController<CustomWcmsComponentModel>
{
    @Override
    protected void fillModel(final HttpServletRequest request, final Model model, final CustomWcmsComponentModel component)
    {

        model.addAttribute("headerText", component.getHeaderText());

        model.addAttribute("buttonText", component.getButtonText());
        model.addAttribute("Image", component.getImage());

    }

    @Override
    protected String getView(CustomWcmsComponentModel component) {
        return "";
    }
}