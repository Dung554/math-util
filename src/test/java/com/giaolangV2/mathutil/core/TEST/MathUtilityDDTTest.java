package com.giaolangV2.mathutil.core.TEST;

import com.giaolangV2.mathutil.core.MathUtility;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //class này sex chứa các hàm kiểm thử code theo style ddt
    //data driven testing, ta tách code kiểm thử (các lệnh assert()) riêng
    //ko gộp chung với bộ data kiểm thử
    //mục tiêu: dễ đọc code kiểm thử, dễ đánh giá đc xem có bao nhiêu test case đag đc test, đã đủ hay chưua, vì nó rất dễ thấy do data nằm riêng
    // -> Giúp nguyên lý pesticide paradox

    //bộ data sẽ đc để riêng ở 1 hàm public static
    //hàm này trả veef 1 mảng các con số 0< hoặc >20, đó là nhxuwng n gây ra
    //Exception khi ta xài hàm getF(). Ta test xem hàm có ném ngoại lệ với data cà chớn hay k

    public static Integer[] initWrongDataSet(){
        return new Integer[]{-1,-2,-3,-4,-100,-1000,21,22,23,100,1000};
    }

    @ParameterizedTest
    @MethodSource("initWrongDataSet")
    public void testFactorialGivenWrongArgumentMinus5ThrowsException(int n){
        assertThrows(IllegalArgumentException.class,()-> {MathUtility.getFactorial(n);});
    }

    //test case #... : check getF() with rightArgument
    public static Object[][] initRightDataSet(){
        return new Object[][] {{0,1},{1,1},{2,2},{3,6},{4,24},{5,120},{6,720}};
    }

    @ParameterizedTest
    @MethodSource("initRightDataSet")
    public void testFactorialGivenRightArgumentRunWell(int n,long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }
}