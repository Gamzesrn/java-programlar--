/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week9;

/**
 *
 * @author Gamze
 */
import java.util.Scanner;
public class example3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir n değeri giriniz");
        int  n=input.nextInt();
         int[]notlar=new int [n];
         int s=0;
        for (int i = 0; i < notlar.length; i++) {
            
            System.out.println((i+1)+".inci not: ");
            notlar[i]=input.nextInt();
        }
        int toplam=0; 
        for (int i = 0; i < notlar.length; i++) {
            toplam=toplam+notlar[i];
        }
        int ortalama =toplam/notlar.length;
        for (int i = 0; i < notlar.length; i++) {
            
            if(notlar[i]<ortalama)
            {
                
                System.out.println("kaldınız");
            }
            else 
            {
                System.out.println("geçtiniz");
                s=s+1;
                
            }
        }
        System.out.println(s+" öğreci geçti");
        System.out.println(n-s+"öğrenci kaldı");
        
        
    }
}
