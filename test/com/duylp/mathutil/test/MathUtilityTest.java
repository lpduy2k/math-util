/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duylp.mathutil.test;

import com.duylp.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Le Phuoc Duy
 */
public class MathUtilityTest {

    // đặt tên hàm theo chuẩn dân test phần mềm, QA/QC
    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);

        assertEquals(expected, actual);
        assertEquals(720, MathUtility.getFactorial(6)); // 6! có đúng là 720 k
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        // màu đỏ đến theo 2 nghĩa:
        // hàm tính đúng, kì vọng sai
        // hàm tính sai, kì vọng đúng
        // mỗi lời gọi hàm ở trên được gọi là 1 Test Case
        // một tình huống test hàm, vs 1 đầu vào, và nhận đầu ra
    }

    // test ngoại lệ thì test như thế nào ??
    // vì khi ngoại lệ xảy ra, app dùng liền, màu đỏ, vì có điều k ổn đã diễn ra, thêm nữa ngoại lệ k phải là value để so sánh, k biết nó là số mấy, chuỗi gì, ngoại lệ chỉ có thể ước lượng nó, chạm nó khi nó xảy ra, test ngoại lệ nên được đọc, diễn giải như sau:
    // Tui đưa vào các tình huống dữ liệu, ví dụ -5, 22, 40
    // Tui muốn nhìn xem ngoại lệ có xảy ra trong tình huống này hay k, nếu có xảy ra, thì mừng lắm luôn, vì app/ hàm chạy đúng như thiết kế
    // Tức là nếu getFactorial(-5) mà ném ra ngoại lệ
    // IllegalArgumentException, có nghĩa là hàm đúng
    // Có nghĩa là màu xanh (đừng bối rối khi có Exception mà lại XANH) XANH vì thiết kế nói rằng tình huống -5 phải có ngoại lệ và nếu ngoại lệ xh, thì hàm đúng
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(-5); // chạy hàm, chưa test. Biết thừ hàm ném ra Ex ta phải chụp lại Ex nếu có thật thì hàm đúng, XANH
        MathUtility.getFactorial(21);
        MathUtility.getFactorial(-1);
        MathUtility.getFactorial(40);
    }
    
}

// Việc test dùng màu sắc, dùng thư viện Unit Test có quy ước nếu tất cả các cặp expected và actual khớp nhau (equals) thì coi như hàm chạy đúng mọi tình huống ta đã test -> XANH
// Nếu trong tất cả các cặp mà ta test, có ít nhất 1 cặp k khớp nhau - ít nhất 1 màu đỏ, coi như hàm k ổn -> ĐỎ chung
// Điều này để đảm bảo rằng, phàm hàm mà đã test các tình huống thì phải đúng hết các tình huống đã test
// Nói cách khác, những gì ta chủ động liệt kê, thì ta phải thấy đúng

