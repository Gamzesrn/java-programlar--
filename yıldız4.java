/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vveek1;

/*


 *
 **
 ***
 ****
 *****
 
 
 */
import java.util.Scanner;
public class yıldız4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen satır sayısı giriniz");
        int row=input.nextInt();
        int boşluk=row-1;
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <=boşluk; k++) {
                System.out.print(" ");
            }
            System.out.println();
            boşluk--;
        }
    }
 
}
