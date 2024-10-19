package com.giaolangV2.mathutil.core;

public class MathUtility {

    // cờ lát này sẽ cun cúp các ham tien ich cho mọi nơi, thuong design for static

    // from 0! to 21! acceptable
    // throw ex if n < 0 && n > 21



    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        var result = 1;
        for (var i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
