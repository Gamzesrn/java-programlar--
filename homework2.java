/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
  adım1 : Başla
  adım2 : lütfen derece cinsinden bir açı giriniz
  adım3 : radyan= acı.π/180
  adım5 : radyanı yazdır
  adım6 : bitir
  
  * 
 */
import java.util.Scanner;
public class homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen derece cinsinden bir açı giriniz");
        int acı= input.nextInt();
        double grad=(acı*200)/180;
        double radyan= (acı* 3.14)/180;
        System.out.println("radyan= "+radyan);
        System.out.println("grad= "+grad);
        
        
        
        
        
        
        
    }
    
}
