/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avrg;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class avg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat(""); // làm tròn đến 2 chữ số thập phân
        System.out.println("Nhập vào số các số nguyên có trong dãy: ");
        n = scanner.nextInt();
         /*
         * bắt đầu duyệt từ biến đếm count = 1 
         * nếu count còn <= n thì nhập vào số number thứ count
         * sau đó cộng giá trị của biến number vào biến sum
         * vòng lặp dừng khi biến đếm count > n.
         */
        for (int count = 1; count <= n; count++) {
            System.out.println("Nhập số thứ " + count + ": ");
            number = scanner.nextInt();
            sum += number;
        }
        avgNumber = (float) sum / n;
        System.out.println("Trung bình cộng = " + decimalFormat.format(avgNumber));

    }
}
/*   double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
      double sum = 0.0;
      for(double num: numArray){
          sum += num;
      }
        double average = sum / numArray.length;
        System.out.format("Tong trung binh cong : %.2f", average); */