/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Print {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int row, temple, i, n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        temple = n;
        for (row = 1; row <= n; row++) {
            for (i = 1; i < temple; i++) {
                System.out.print(" ");
            }

            temple--;

            for (i = 1; i <= 2 * row - 1; i++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
    }
    

