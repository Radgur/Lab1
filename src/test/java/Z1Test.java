import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Z1Test {

    @Test
    void perebor() {
        assertEquals("fizz", Z1.perebor(5));
        assertEquals("buzz", Z1.perebor(7));
        assertEquals("fizzbuzz", Z1.perebor(35));
    }
}