/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gamze
 */
import java.util.Scanner;
public class paraüstünüenazsayıdaparaylaverenprogram {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int s=0;
        System.out.println("bir tutar giriniz");
        double tutar=klavye.nextInt();
        System.out.println("verilen parayı giriniz");
        double verilenpara=klavye.nextInt();
        double paraüstü=verilenpara-tutar ;
        System.out.println("paraüstü= "+paraüstü);
        while(paraüstü>=200){
            System.out.println("200 tl veriniz");
            s++;  
            paraüstü=paraüstü-200;
        }
        while(paraüstü>=100){
            System.out.println("100 tl veriniz");
            s++;    
             paraüstü=paraüstü-100;
        }
        if(paraüstü>=50){
            System.out.println("50 tl veriniz");
            s++;   
             paraüstü=paraüstü-50;
        }
        while(paraüstü>=20){
            System.out.println("20 tl veriniz");
            s++;  
             paraüstü=paraüstü-20;
        }
        if (paraüstü>=10) {
            System.out.println("10 tl veriniz");
            s++;
             paraüstü=paraüstü-10;
        }
        if(paraüstü>=5){
            System.out.println("5 tl veriniz");
            s++;      
             paraüstü=paraüstü-5;
        }
        while (paraüstü>=1) {
            System.out.println("1 tl veriniz");
            s++;    
             paraüstü=paraüstü-1;
        }
        while (paraüstü>=0.5) {
            System.out.println("50 kr veriniz");
            s++;    
            paraüstü=paraüstü-(0.5);
        }
        if (paraüstü>=0.25) {
            System.out.println("25 kr veriniz");
            s++;    
            paraüstü=paraüstü-(0.25);
        }
        while (paraüstü>=0.10) {
            System.out.println("10 kr veriniz");
            s++;    
            paraüstü=paraüstü-(0.10);
        }
        if (paraüstü>=0.05) {
            System.out.println("5 kr veriniz");
            s++;    
            paraüstü=paraüstü-(0.05);
        }
        
        System.out.println(s+ " tane para verildi");
        
    }
}
