package com.github.truongbb.simplespringserver.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<Gender, String> {

  @Override
  public boolean isValid(String gender, ConstraintValidatorContext constraintValidatorContext) {
    if (!com.github.truongbb.simplespringserver.constant.Gender.MALE.equals(gender.trim())
      && !com.github.truongbb.simplespringserver.constant.Gender.FEMALE.equals(gender.trim())
      && !com.github.truongbb.simplespringserver.constant.Gender.UNKNOWN.equals(gender.trim())) {
      constraintValidatorContext.buildConstraintViolationWithTemplate("Gender must be MALE, or FEMALE, or even UNKNOWN").addConstraintViolation();
      return false;
    }
    return true;
  }

}
