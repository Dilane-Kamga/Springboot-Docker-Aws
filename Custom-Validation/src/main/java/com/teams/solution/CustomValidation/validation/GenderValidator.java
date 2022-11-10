package com.teams.solution.CustomValidation.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class GenderValidator implements ConstraintValidator<ValidateGender, String> {

    @Override
    public boolean isValid(String gender, ConstraintValidatorContext constraintValidatorContext) {
        List<String> genders = Arrays.asList("MALE", "FEMALE");
        return genders.contains(gender.toUpperCase());
    }
}
