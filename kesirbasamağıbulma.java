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
public class kesirbasamağıbulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen kesrin pay kısmını giriniz : ");
        double a= input.nextDouble();
        System.out.println("lütfen kesrin payda kısmını giriniz : ");
        double b =input.nextDouble();
        double c=a/b;
        System.out.println("kesir = "+c);
        System.out.println("Kaçıncı basamağı öğrenmek istiyorsunuz");
        int n =input.nextInt();
        double p=0;
        for ( int i = 1; i <=n; i++) {
         
          p =c%10;
          c=c/10;
        }
        System.out.println(p);
        
        
    }
    
}
