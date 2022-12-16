/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.Random;
public class randomharftahminetmeprogramı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random r= new Random();
        int a=r.nextInt(99);
        System.out.println("random harf= "+a);
        int harf=a;
        for (int i = 1; i <= 10; i++) {
           System.out.println("lütfen tahmininizi giriniz ");
           int tahmin=input.nextInt();
           if(tahmin==harf)
           {
               System.out.println(i+" . tahminde buldunuz");
           }
        }
        System.out.println("tahmin hakkınız bitti");
    }
}
