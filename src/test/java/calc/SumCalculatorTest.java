package calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
     void setSumCalculator() {
        this.sumCalculator = new SumCalculator();
    }
    @Test
     void sumFrom1Equals1Test() {
        Assertions.assertEquals(1, sumCalculator.sum(1));
    }

    @Test
     void sumFrom3Equals6Test() {
        Assertions.assertEquals(6, sumCalculator.sum(3));
    }

    @Test
     void zeroCheckTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}