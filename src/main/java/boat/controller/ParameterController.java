package boat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class ParameterController{

    @RequestMapping("param.html")
    public String getParam(@RequestParam("action") String action, ModelMap model) {
        model.addAttribute("msg", action);
        return "CustomerPage";
    }
}
