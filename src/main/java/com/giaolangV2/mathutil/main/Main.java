package com.giaolangV2.mathutil.main;

import com.giaolangV2.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {

        // Test case 1:
        // Description: Describe about purpose of test case, what do test cases test for?
        // Test summary: To verify that getFactorial with correct result with n = 0
        // Test step/procedures: Call getFactorial method with valid argument: getFactorial(0)
        // Expected result: result = 0;
        // Status: Passed or Failed


        // Test case 2:
        //
        // Test summary: To verify that getFactorial with correct result with n = 5
        // Test step/procedures: Call getFactorial method with valid argument: getFactorial(5)
        // Expected result: result = 120;
        // Status: Passed or Failed



        // cach 1: in ra console va so sanh actual, expected
        // cach 2: in ket qua vao 1 tap tin
        // log file la tap tin .txt ghi lai nhat ki hoat dong cua app
        // cach 3: yeu cau cai them framework giup ho tro viec test ham cua ban - unit testing framework
        // =========================
        // cau hoi
        testFactorialGivenRightArgument5ReturnsWell();


    }


    static void testFactorialGivenRightArgument0ReturnsWell() {
        int n = 0;
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(0);
        System.out.println(n + "! = \n"
                + "expected value: " + expectedResult + "\n"
                + "actual value: " + actualResult);
    }

    static void testFactorialGivenRightArgument5ReturnsWell() {
        int n = 5;
        long expectedResult = 120;
        long actualResult = MathUtility.getFactorial(0);
        System.out.println(n + "! = \n"
                + "expected value: " + expectedResult + "\n"
                + "actual value: " + MathUtility.getFactorial(5));
    }

    }