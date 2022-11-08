/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
  adım1 :başla
  adım2 :lütfen bir kenar uzunluğu giriniz
  adım3 :lütfen bir yükseklik giriniz
  adım4 :alan=kenar*yükseklik/2
  adım5 :alanı yazdır
  adım6 :bitir
 */
import java.util.Scanner;
public class homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir kenar uzunluğu giriniz");
        int kenar=input.nextInt();
        System.out.println("Lütfen yükseklik giriniz");
        int yükseklik =input.nextInt();
        double alan=kenar*yükseklik/2;
        System.out.println("alan="+alan);
                
        
        
        
        
    }
    
}
