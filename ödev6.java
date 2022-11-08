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
public class ödev6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir n sayı giriniz");
        int n =input.nextInt();
        int S=1;
        int toplam=0;
        while (S<=n){
            
          if (S%2!=0) {
                toplam=toplam+S;
                
            }
          S=S+1;
        }
        System.out.println("toplam "+toplam);
        
        
    }
    
    
    
}
