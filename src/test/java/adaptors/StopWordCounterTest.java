package adaptors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wordcount.services.impls.stopWordImpl;
import wordcount.services.interfaces.StopWord;

import static org.junit.jupiter.api.Assertions.*;

class StopWordCounterTest {

    private StopWord stopWord;
    @BeforeEach
    void setUp() {
        stopWord = new stopWordImpl();
    }

    @Test
    void wordCounter() {
    }
}