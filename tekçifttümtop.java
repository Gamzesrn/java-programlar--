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
public class tekçifttümtop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int çt=0,tt=0,tümt=0;
        System.out.print("lütfen bir sayı giriniz : ");
        
        int n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            if (i%2==0) {
                çt=çt+i;
            }
            else
            {
                tt=tt+i;
            }
            tümt=tümt+i;
        }
        System.out.println("çift sayıların toplamı = "+çt);
        System.out.println("tek sayıların toplamı = "+tt);
        System.out.println("tüm sayıların toplamı = "+tümt);
        
        
        
    }
    
}
