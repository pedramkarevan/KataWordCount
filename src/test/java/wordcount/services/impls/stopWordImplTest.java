package wordcount.services.impls;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wordcount.services.interfaces.StopWord;

import static org.junit.jupiter.api.Assertions.*;

class stopWordImplTest {
    private StopWord stopWord;

    @BeforeEach
    void setUp() {
        stopWord = new stopWordImpl();
    }

    @Test
    void stopWordMapper() {
        assertAll("Stop words mapper",
                () -> assertEquals("MARY A LITTLE LAMB ", stopWord.stopWordMapper("Mary had a little lamb", "HAD"), "Upper Case Validation"),
                () -> assertEquals("MARY LITTLE LAMB ", stopWord.stopWordMapper("Mary had a little lamb", "had a"), "Two words Validation"),
                () -> assertEquals("MARY LITTLE LAMB ", stopWord.stopWordMapper("Mary had a little lamb", "HAD a"), "Upper Case and multiple words Validation"));

    }


}
