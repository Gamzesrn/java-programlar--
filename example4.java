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
public class example4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        do {            
            System.out.println("lütfen pozitif bir n değeri giriniz: ");
            n=input.nextInt();
        } while (0>n);
        int[]fiboc=new int[n];
        fiboc[0]=1;
        fiboc[1]=1;
        System.out.println(fiboc[0]+"");
        System.out.println(fiboc[1]+"");
        for (int i = 2; i < fiboc.length; i++) {
            int yeni =fiboc[i-1]+fiboc[i-2];
            fiboc[i]=yeni;
            System.out.println(fiboc[i]);
        }
        
    }
}
