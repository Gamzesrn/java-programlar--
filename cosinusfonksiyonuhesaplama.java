/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class cosinusfonksiyonuhesaplama {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir x değeri giriniz ");
        int x=input.nextInt();
        System.out.println("lütfen bir n değeri giriniz ");
        int n =input.nextInt();
        double t=1;
        for (int i = 1; i <= n; i++) {
           int f=1;
            for (int j = 1; j <= 2*i; j++) {
                f=f*j;
            }
            t=(double) t+(Math.pow(-1, i)*Math.pow(x, (2*i)))/f;
        }
        System.out.println("toplam= "+t);
    }
}
