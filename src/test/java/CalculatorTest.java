import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator main = new Calculator();

    @Test
    void add() {
        assertEquals(2,main.add(1,1));
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void dif() {
        assertEquals(2,main.dif(3,1));
        assertEquals(0, calculator.dif(1, 1));
    }

    @Test
    void div() throws Exception {
        assertEquals(4,main.div(8,2));
          assertEquals(1, calculator.div(1, 1));
          assertThrows(Exception.class, () -> calculator.div(1, 0));
    }

    @Test
    void times() {
        assertEquals(4,main.times(2,2));
    }

    @Test
    void solver() throws Exception {
        assertThrows(Exception.class, () -> calculator.solver(0, 1));
        assertEquals(1, calculator.solver(2, 4));
    }
}