import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator main = new Calculator();

    @Test
    void add() {
        assertEquals(2,main.add(1,1));
    }

    @Test
    void dif() {
        assertEquals(2,main.dif(3,1));
    }

    @Test
    void div() throws Exception {
        assertEquals(4,main.div(8,2));
    }

    @Test
    void times() {
        assertEquals(4,main.times(2,2));
    }

    @Test
    void solver() {
        assertEquals(12,main.solver(4,2));
    }
}