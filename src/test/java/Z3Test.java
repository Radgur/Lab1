import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Z3Test {

    @Test
    void DIS() {
        assertEquals("¯\\_(°͜°)_/¯",Z3.DIS(0,0,0));
        assertEquals("x0=0.5",Z3.DIS(0,2,-1));
        assertEquals("x1=4.0 x2=1.0",Z3.DIS(1,-5,4));
        assertEquals("x0=-1.0",Z3.DIS(3,6,3));
        assertEquals("Нет вещественных корней",Z3.DIS(5,-3,2));
    }
}