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
public class tersyazanprgm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int n=input.nextInt();
        System.out.print("sayının tersi = ");
        while(n>0){
            System.out.print(n%10);
            n=n/10;
        }
        
        
    }
    
}
