package boat.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/welcome")
public class HelloController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "First param test.");
        model.addAttribute("message2", "Second param test.");
        return "hello";

    }

    @RequestMapping(value = "/pass", method = RequestMethod.GET)
    public String pass(ModelMap model) {

        model.addAttribute("message", "click!!.");
        model.addAttribute("message2", "click2!!.");
        return "hello";

    }

}