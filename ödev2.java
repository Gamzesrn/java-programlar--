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
public class ödev2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen 1-7 arasında bir sayı giriniz");
        int sayi = input.nextInt();
        if(sayi==1){
        System.out.println("pazartesi");
        }
        if(sayi==2){
        System.out.println("salı");
        
    }
       else if(sayi==3){
        System.out.println("Çarşamba");
        
    }
        else if(sayi==4){
        System.out.println("perşembe");
        
    }
        else  if(sayi==5){
        System.out.println("cuma");
        
    }
          else if(sayi==6){
        System.out.println("cumartesi");
        
    }
          else if (sayi == 7){
        System.out.println("pazar");
        
    }
        
    }
    
}
