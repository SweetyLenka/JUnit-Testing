package com.userreg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {

    @Test
    public void isFirstNameValid()
    {
        UserValidator validator = new UserValidator();
        boolean result=validator.validateFirstName("Sweety");
        Assertions.assertEquals(true,result);

    }
    @Test
    public void isLastNameValid()
    {
        UserValidator validator = new UserValidator();
        boolean result=validator.validateLastName("Das");
        Assertions.assertEquals(true,result);

    }
    @Test
    public void isEmailValid()
    {
        UserValidator validator = new UserValidator();
        boolean result=validator.validateEmail("sweetylenka2013@gmail.com");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void isMobileValid()
    {
        UserValidator validator = new UserValidator();
        boolean result=validator.validateMobile("91 1234567890");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void isPasswordValid()
    {
        UserValidator validator = new UserValidator();
        boolean result=validator.validatePassword("Sweety@2020");
        Assertions.assertEquals(true,result);
    }






}
