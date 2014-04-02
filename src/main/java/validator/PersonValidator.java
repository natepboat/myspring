package validator;

import bean.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {

        return clazz == Person.class;
    }

    @Override
    public void validate(Object target, Errors errors) {

        Person p = (Person) target;

        ValidationUtils.rejectIfEmpty(errors, "name", "nameEmpty", "enter name");
        if (p.getAge() <= 0 || p.getAge() > 110) {
            errors.rejectValue("age", "wrongAge", "enter valid age");
        }
        ValidationUtils.rejectIfEmpty(errors, "sex", "sexEmpty", "select sex");
        ValidationUtils.rejectIfEmpty(errors, "location", "locationEmpty",
                "select location");
    }
}