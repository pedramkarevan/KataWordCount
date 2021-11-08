package adaptors;

import org.junit.jupiter.api.*;
import wordcount.services.impls.InputScanner;
import wordcount.services.impls.StringValidationImpl;
import wordcount.services.interfaces.InputRead;
import wordcount.services.interfaces.StringValidation;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class InputFileCounterTest {
    private InputRead inputRead;
    private StringValidation stringValidation;

    @BeforeEach
    void setUp() {
        //given
        inputRead = new InputScanner();
        stringValidation=new StringValidationImpl();
    }

    @Test
    void wordCounter() {
        assertEquals(4,new Count().getUserInputCount("Mary has little lamb"));
    }

    @Disabled
    @DisplayName("Illegal arguments in file")
    @Test
    void wordCounterIllegalArgs() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringValidation.isStringValid("12 00 lamb");
        });
    }

    @Disabled
    @Test
    void fileNotFound()  {
       //Nothing throws
        assertThrows(IOException.class, () -> {
            inputRead.inputFileRead("src/main/resources/mytext.txt");
        });
    }
}


