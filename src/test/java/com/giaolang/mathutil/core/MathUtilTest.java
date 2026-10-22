package com.giaolang.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.giaolang.mathutil.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    //test case 4: test hàm với đầu vào ko hợp lệ
    //n = -1, hy vọng hàm: TRẢ VỀ NGOẠI LỆ!!! IllegalArgumentException
    @Test
    void testFactorialGivenInvalidNMinus1ThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> {getFactorial(-10);});
    }

    //test case 3: test hàm với đầu vào hợp lệ, n = 0, hy vọng trả về 1
    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        long expected = 1;
        int n = 0;
        long actual = getFactorial(n);

        //so sánh tự động giúp tui expected có == actual hay ko
        //nếu == thì quất màu xanh
        //nếu != quất màu đỏ!!!
        assertEquals(expected, actual);
    }

    //test case 2: test hàm với đầu vào hợp lệ, n = 6, hy vọng trả về 720
    @Test
    void testFactorialGivenValidN6ReturnsWell720() {
        long expected = 720;
        int n = 6;
        long actual = getFactorial(n);

        //so sánh tự động giúp tui expected có == actual hay ko
        //nếu == thì quất màu xanh
        //nếu != quất màu đỏ!!!
        assertEquals(expected, actual);
    }

    //test case 1: test hàm với đầu vào hợp lệ, n = 5, hy vọng trả về 120
    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = getFactorial(n);

        //so sánh tự động giúp tui expected có == actual hay ko
        //nếu == thì quất màu xanh
        //nếu != quất màu đỏ!!!
        assertEquals(expected, actual);
    }


}