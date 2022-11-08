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
public class kendim1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double t=0;
        int s=0;
        System.out.println("kaç adet sayı girilecek");
        int n =input.nextInt();
        while(s<n){
            for(int i=0;i<n;i++)
            {
              System.out.println("bir sayı giriniz");
              double si =input.nextDouble();
              t+=si;
              s+=1;
            }
         }
        double ort=t/n;  
        System.out.println("ortalama= "+ort);
        
    
}
}