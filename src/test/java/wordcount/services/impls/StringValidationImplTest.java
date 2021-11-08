package wordcount.services.impls;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import wordcount.services.interfaces.StringValidation;

import static org.junit.jupiter.api.Assertions.*;

class StringValidationImplTest {

    private StringValidation stringValidation;

    @BeforeEach
    void setUp() {
        stringValidation= new StringValidationImpl();
    }

    @DisplayName("User input validation")
    @Test
    void isStringValid() {

        assertAll("User input validation assert all",
                () -> assertEquals(false ,stringValidation.isStringValid("Mary had a little lamb 2")),
                () -> assertEquals(true ,stringValidation.isStringValid("Mary had a little lamb ")),
                () -> assertEquals(false,stringValidation.isStringValid("")));

         }
}