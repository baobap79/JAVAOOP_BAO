
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class DtoB {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary[] = new int[40];
        int index = 0;
        int num;
        num = sc.nextInt();
         while(num > 0){
            // IDEA: CẤP SỐ CHIA MỘT SÓ NHẬP VÀO TỚI KHI BẰNG 0. SAU ĐÓ LẤY SỐ ĐÓ TRỪ ĐI SỐ CHIA HẾT CHO 2.
            binary[index++] = num%2;
            num = num/2;    
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
            
            
    }
    
}
}