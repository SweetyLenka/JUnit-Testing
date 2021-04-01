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
    


}
