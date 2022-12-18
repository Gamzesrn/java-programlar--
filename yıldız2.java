package com.mycompany.vveek1;

/*


 *
 **
 ***
 ****
 *****
 ******

 */

import java.util.Scanner;
public class yıldız2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen satır sayısı giriniz");
        int  row=input.nextInt();
        int bosluk=row;
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <=bosluk-i; k++) {
                System.out.print("");
            }
            System.out.println("");
        }
    }
}
