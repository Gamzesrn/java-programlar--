/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class sinüsfonksiyonuhesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir x değeri giriniz");
        double x =input.nextDouble();
        System.out.println("lütfen bir n değeri giriniz");
        double n = input.nextDouble();
        double t=0;
        for (double i = 1; i <= n; i++) {
            double  f=1;
            for (double j = 1; j <= 2*i-1; j++) {
                f=f*j;
            }
           t=(double) t+ (Math.pow(-1,(i-1))* Math.pow(x,(2*i-1)))/f;    
        }
        System.out.println("toplam= "+t);    
    }
}
