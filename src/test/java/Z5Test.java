import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Z5Test {

    @Test
    void pal_check() {
        assertEquals(true,Z5.pal_check("aboba"));
        assertEquals(false,Z5.pal_check("abob"));
    }
}