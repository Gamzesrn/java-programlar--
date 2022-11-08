/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class fonksiyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("bir x sayısı giriniz");
        int x=input.nextInt();
       int sonuc=(int) (Math.pow(x,2)-5*x+3);
       if(sonuc<0)
       {
        System.out.println("sonuç = "+sonuc);
        
       }
       else if(sonuc>0)
       {
               System.out.println("sonuç= "+sonuc);    
       }
       else
       {
           System.out.println("Sonuç= "+sonuc);
       }
           
    
}
}
