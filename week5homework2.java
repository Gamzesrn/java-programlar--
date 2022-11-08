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
public class week5homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int sayi;
        do
        {
        System.out.println("bir sayısı giriniz");
         sayi =input.nextInt();
        }while(sayi<7);
                {
        for (int i = 1; i < sayi; i++) {
            for (int j = 1; j < sayi; j++) {
                if(sayi==3*i+5*j){
                    System.out.println("3 ün "+i+" .katı 5in "+j+" .katı");
                }
                
            }
                
            
        }
                }
    }
}

  
        
        
