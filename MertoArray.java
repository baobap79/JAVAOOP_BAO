/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MertoArray;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MertoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size1, size2, size, i, j, k;
       int arr1[] = new int[50];
       int arr2[] = new int[50];
       int merge[] = new int[100];
        Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Array 1 Size : ");
       size1 = scan.nextInt();
	   
       System.out.print("Enter Array 1 Elements : ");
       for(i=0; i<size1; i++)
       {
           arr1[i] = scan.nextInt();
       }
	   
       System.out.print("Enter Array 2 Size : ");
       size2 = scan.nextInt();
	   
       System.out.print("Enter Array 2 Elements : ");
       for(i=0; i<size2; i++)
       {
           arr2[i] = scan.nextInt();
       }
	   
       System.out.print("Merging the Arrays...\n");
       for(i=0; i<size1; i++)
       {
           merge[i] = arr1[i];
       }
	   
       size = size1 + size2;
	   
       for(i=0, k=size1; k<size && i<size2; i++, k++)
       {
           merge[k] = arr2[i];
       }
	   
       System.out.print("Now the New Array after Merging is :\n");
       for(i=0; i<size; i++)
       {
           System.out.print(merge[i] + "  ");
    }
    
}
}