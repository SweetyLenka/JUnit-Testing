package com.userreg;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserValidationTest {
    UserValidator validator = new UserValidator();
    boolean result;

    @Test
    public void isFirstNameValid()
    {
        result=validator.validateFirstName("Sweety");
        assertEquals(true,result);

    }
}
