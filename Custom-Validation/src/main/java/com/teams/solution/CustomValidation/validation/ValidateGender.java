package com.teams.solution.CustomValidation.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = GenderValidator.class)
public @interface ValidateGender {

    public String message() default "Invalid Gender: It should be either Male or Female";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
