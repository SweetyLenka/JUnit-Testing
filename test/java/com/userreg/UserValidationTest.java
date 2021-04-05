package com.userreg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    
     UserValidator validator = new UserValidator();

    @Test
    public void isFirstNameValid()
    {
        boolean result=validator.validateFirstName("Sweety");
        Assertions.assertEquals(true,result);

    }
    @Test
    public void isLastNameValid()
    {
        boolean result=validator.validateLastName("Das");
        Assertions.assertEquals(true,result);

    }
    @Test
    public void isEmailValid()
    {
        boolean result=validator.validateEmail("sweetylenka2013@gmail.com");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void isMobileValid()
    {
        boolean result=validator.validateMobile("91 1234567890");
        Assertions.assertEquals(true,result);
    }
}
