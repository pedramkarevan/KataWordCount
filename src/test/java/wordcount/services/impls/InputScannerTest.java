package wordcount.services.impls;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import wordcount.services.interfaces.InputRead;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class InputScannerTest {
    private InputRead inputScanner;

    @BeforeEach
    void setUp() {
        inputScanner = new InputScanner();
        // MOCK System.in
        String data = "Mary had a little lamb";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));

    }

    @DisplayName("Scanner reader")
    @Test
    void read() {

        assertEquals("Mary had a little lamb", inputScanner.read(), "Reading from Scanner");
    }


}
