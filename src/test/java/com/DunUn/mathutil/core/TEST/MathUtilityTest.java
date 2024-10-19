package com.DunUn.mathutil.core.TEST;
import com.giaolangV2.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
    @Test
    public void testFactorialGivenRightArgument0ReturnWell(){
        long expectedValue = 1;
        long actualValue= MathUtility.getFactorial(0);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void testFactorialGivenRightArgument5ReturnsWell() {
        assertEquals(120,MathUtility.getFactorial(5));
    }
    //test case 3: check getFactorial() with n=2 3 4 5 6...
    @Test
    void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(1,MathUtility.getFactorial(0));
        assertEquals(1,MathUtility.getFactorial(1));
        assertEquals(2,MathUtility.getFactorial(2));
        assertEquals(6,MathUtility.getFactorial(3));
        assertEquals(24,MathUtility.getFactorial(4));
        assertEquals(120,MathUtility.getFactorial(5));
        assertEquals(720,MathUtility.getFactorial(6));

    }
    //test case 4: check getFactorial() with n =-1,-2,-3,-4,-5,21,22,23,24
    @Test
    void testFactorialGivenWrongArgumentMinus5ThrowsException() {
        assertThrows(IllegalArgumentException.class,()->{MathUtility.getFactorial(-1);});
        assertThrows(IllegalArgumentException.class,()->{MathUtility.getFactorial(-2);});
        assertThrows(IllegalArgumentException.class,()->{MathUtility.getFactorial(-3);});
        assertThrows(IllegalArgumentException.class,()->{MathUtility.getFactorial(-4);});
        assertThrows(IllegalArgumentException.class,()->{MathUtility.getFactorial(-5);});
        assertThrows(IllegalArgumentException.class,()->{MathUtility.getFactorial(21);});
        assertThrows(IllegalArgumentException.class,()->{MathUtility.getFactorial(22);});
        assertThrows(IllegalArgumentException.class,()->{MathUtility.getFactorial(23);});
        assertThrows(IllegalArgumentException.class,()->{MathUtility.getFactorial(24);});

    }
}