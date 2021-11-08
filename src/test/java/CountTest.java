import adaptors.Count;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTest {

    private Count count;
    @BeforeEach
    void setUp() {
        count =new Count();
    }

    @DisplayName("User Input Counter")
    @Test
    void getUserInputCount() {
        assertEquals(5,count.getUserInputCount("Mary has a little lamp"));
    }
}