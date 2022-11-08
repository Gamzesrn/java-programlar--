/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
import java.lang.Math;
public class çarpısızçarpma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen birinci sayıyı giriniz");
        int s1=input.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz");
        int s2=input.nextInt();
        int sonuc=0;
        for (int i = 1;i <=s2; i++) {
            sonuc=sonuc+s1;
        }
        System.out.println("girilen iki sayının çarpımı = "+ sonuc);
        
    }
    
}
