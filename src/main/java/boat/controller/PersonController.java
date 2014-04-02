package boat.controller;

import bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import validator.PersonValidator;

@Controller
public class PersonController {

    @InitBinder
    public void initModel(WebDataBinder binder) {

        Object target = binder.getTarget();

        if (target instanceof Person) {
            if (binder.getValidator() == null) {
                binder.setValidator(new PersonValidator());
            }
        }
    }

    @RequestMapping(value = "/index.htm")
    public ModelAndView showForm(Person p) {

        ModelAndView model = new ModelAndView("PersonForm");

        model.addObject("person", p);
        return model;
    }

    @RequestMapping(value = "/showPerson.htm", method = RequestMethod.POST)
    public ModelAndView submitPerson(@Validated Person p, BindingResult error) {

        // Submit to Database or else
        ModelAndView model = new ModelAndView();
        model.addObject("person", p);

        if (error.hasErrors()) {
            model.setViewName("PersonForm");
        }

        return model;
    }
}