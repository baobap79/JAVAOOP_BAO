/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Remove;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Remove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // * Khởi tạo mảng * / 
        int[] arr_elements = new int[20];

        /* biến Initial_element khởi tạo bằng 0 và
trỏ đến phần tử đầu tiên của mảng * /
  / * next_element trỏ đến phần tử tiếp theo của mảng */
        int initial_element, next_element;
        int i;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");// Hiển thị kích thước mảng cho người dùng
        int arr_size = sc.nextInt();

        /*Display message for array element*/
        System.out.println("Read Array Elements From User :");
        /*Display message for array element*/

 /*Loop to take input array elements*/
        for (i = 0; i < arr_size; ++i) { // Vòng lặp để nhận các phần tử mảng đầu vào 
            System.out.print("Enter array elements of index " + i + ": ");
            arr_elements[i] = sc.nextInt();
        }

        // Display array before removing duplicate element 
        System.out.println("Before removing duplicate element array are :"); // Hiển thị mảng trước khi xóa phần tử trùng lặp 

        // Vòng lặp để hiển thị các phần tử mảng * / 
        for (i = 0; i < arr_size; ++i) {
            System.out.println(arr_elements[i]);
        }

        // Get new line
		
		// Hiển thị mảng sau khi loại bỏ phần tử mảng trùng lặp 
        System.out.println("After removing duplicate element array are :");
        for (initial_element = 0; initial_element < arr_size; ++initial_element) {
            for (next_element = initial_element + 1; next_element < arr_size;) {
                /* nếu initial_element khớp với next_element
sau đó thực hiện _element tiếp theo và các trận đấu cho đến khi kết thúc */ 
                if (arr_elements[initial_element] == arr_elements[next_element]) {
                    for (int temp = next_element; temp < arr_size; ++temp) {
                        arr_elements[temp] = arr_elements[temp + 1];
                    }
                    arr_size = arr_size - 1;
                } else {
                    next_element++;
                }
            }
        }

        /* Loop to display array after removing duplicate element */
        for (i = 0; i < arr_size; ++i) {
            System.out.println(arr_elements[i]);
        }
    }

}
