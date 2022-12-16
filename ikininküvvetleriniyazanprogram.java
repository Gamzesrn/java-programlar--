/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Gamze
 */

public class ikininküvvetleriniyazanprogram {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=input.nextInt();
        for (int i = 0; i <= sayi; i++) {
            System.out.println("2'nin "+i+". kuvveti "+(int)Math.pow(2, i)+" dir");
        }
    }
}
