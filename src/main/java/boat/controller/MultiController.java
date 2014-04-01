package boat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MultiController {

    @RequestMapping("/customer/add.htm")
    public ModelAndView add(HttpServletRequest request,
                            HttpServletResponse response) throws Exception {

        return new ModelAndView("CustomerPage", "msg", "add");

    }

    @RequestMapping("/customer/delete.htm")
    public ModelAndView delete(HttpServletRequest request,
                               HttpServletResponse response) throws Exception {

        return new ModelAndView("CustomerPage", "msg", "delete");

    }

    @RequestMapping("/customer/update.htm")
    public ModelAndView update(HttpServletRequest request,
                               HttpServletResponse response) throws Exception {

        return new ModelAndView("CustomerPage", "msg", "update");

    }

    @RequestMapping("/customer/list.htm")
    public ModelAndView list(HttpServletRequest request,
                             HttpServletResponse response) throws Exception {

        return new ModelAndView("CustomerPage", "msg", "list");

    }
}
