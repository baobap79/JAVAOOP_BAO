/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonaccii;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int count, num1 = 0, num2 = 1;
        System.out.println("Nhập vào số lượng các số mà bạn muốn hiển thị: ");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.print("Chuỗi Fibonacci với "+count+" số là: ");
        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
        System.out.println();
        System.out.println("----------------------------");
       
    } 
        
        /*
        // đầu vào để in chuỗi Fibonacci tối đa bao nhiêu số
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci series upto " + number + " numbers : ");
        // in chuỗi Fibonacci lên đến số 
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci2(i) + " ");
        }

    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
// Tính toán số Fibonacci bằng cách sử dụng vòng lặp hoặc lặp lại.

    public static int fibonacci2(int number) {
        if (number == 1 || number == 2) {
            return 1;
            int fibo1 = 1, fibo2 = 1, fibonacci = 1;
            for (int i = 3; i <= number; i++) {
                // Số Fibonacci là tổng của hai số Fibonacci trước đó
            }
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;  
            fibo2 = fibonacci;

            

        }
        return Fibonacci; //Fibonacci number
    }
*/
}
