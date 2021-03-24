/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duylp.mathutil.main;

import com.duylp.mathutil.MathUtility;

/**
 *
 * @author Le Phuoc Duy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tui mún test 5! có bằng 120 hay hơm ?
        int n = 5; // 5! coi bằng mấy
        long expected = 120; // tui kì vọng, hy vọng bạn/ hàm tính ra 120.
        long actual = MathUtility.getFactorial(n);
        
        System.out.println("5! expected: "+ expected + "; actual: " + actual);
    }
    
}

//Trong quy trình làm phần mềm, dân dev phải có trách nhiêm test từng hàm từng class mà mình việc ra trước khi đóng gói gửi cho bên QA/QC test độc lập, từng hàm , từng class phải được test cẩn thận trước khi chúng được dùng để phối hợp vs các class khác, test ngay mức hàm, mức class vừa hoàn thiện, chưa thèm bàn về UI, thì mức độ test sớm này gọi là UNIT TEST LEVEL - TEST từng đơn thể, đơn vị code
// Vậy làm sao để test từng hàm, từng class ??
// CÓ nhieuf cách để test từng hàm từng class
// 1. Cách 1: DÙng sout(gọi hàm cần test()) để in ra giá trị xử lí của hàm
// Dùng trong môn OOP
// 2. Cách 2: Dùng JOptionPane của môn Java Desktop để pop-up một cửa sổ in kết quả xử lí của hàm để kiểm tra coi hàm chạy đúng sai
// 3. Cách 3: Dùng Log file, trang Web in ra kết quả xử lí của hàm (môn Java Web)
// dù là cách nào thì cũng cần phải in ra giá trị hàm đã xử lí gọi là ACTUAL VALUE
// rồi ta đi so sánh cái giá trị trả về của hàm có giống như ta tính toán trước đó hay không, cái ta hy vong hàm sẽ trả về - gọi là EXPECTED VALUE
// nếu ACTUAL VALIUE == EXPECTED VALUE -> hàm chạy ngon
//                   !=                -> hàm sai
// Nguyên tắc của việc test: so sánh ACTUAL VỚI EXPECTED
// 3 cách này đều cùng 1 nguyên tắc:
// gọi hàm này để xem hàm xử lí ra kết quả mấy sau đó dùng mắt để so sánh ACTUAL và EXPECTED rồi ta tự kết luận cách này tiềm ẩn sai sót khi ta phải xem xét quá nhiều cặp VALUE ví dụ hàm GTHUA() phải test trường hợp N<0, =0, =1, 18, 19, 20 (Biên) 21, 30, 1Trieu
// MỖi n để test ta gọi là 1 tình huống xài hàm, 1 tình huống test 
// Test case
// 4. Cách 4: Không thèm nhìn bằng mắt từng trường hợp expected vs actual nhờ máy nhìn giùm luôn, vì máy dư sức biết cách so sánh máy quét qua tất cả các cặp expected vs actual nếu tất cả đều khớp báo tao màu Xanh - Đường thống báo code tốt, nếu có xuất hiện ít nhất 1 thằng ko khớp actual vs expected báo tao màu đỏ, đường kẹt, do code có trục trặc tính toán , muốn làm được điều này ta cần thư viện phụ trợ
// Java: JUnit, TestNG
// C#: NUnit, MsTest, xUnit
// PHP: PHPUnit
// ... Mọi ngôn ngữ đều có thư viện Xanh Đỏ giúp cảnh báo hàm tốt hay ko


