/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duylp.mathutil;

/**
 *
 * @author Le Phuoc Duy
 */
public class MathUtility {
    //ta sẽ tạo các hàm trong class này fake y chang class Math của JDK
    //các hàm sẽ xài chung ở nhiều nơi, làm tiện ích dùng chung
    //phàm cái gì dùng chung thì ta suy nghĩ đến STATIC

    public static final double PI = 3.1415; // y chang Math.PI
    // Lát hồi MathUtility.PI
    // hàm tính n! = 1.2.3.4.5.6...n
    // Quy ước: 0! = 1! = 1;
    // Ko có giai thừa âm
    // vì giai thừa tăng cực nhanh về giá trị, 21 tràn kiểu long
    // ta sẽ khống chế n đầu vào của hàm 0..20
    // kiểu long: 10^18, 18 con số 0 tối đa

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. n must be between 0...20");
        if (n == 0 || n == 1) 
            return 1;
        long result = 1;
        for (int i = 2; i <= n; i++)
            result = result * i;
        return result;
    }
}
