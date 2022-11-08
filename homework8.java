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
public class kendim3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        System.out.println("kilonuzu giriniz");
        double kilo=input.nextDouble();
        System.out.println("boyunuzu giriniz");
        double boy= input.nextDouble();
        double vki=kilo/(boy*boy);
        System.out.println("vücut kitle indeksiniz = "+vki);
    }
    
}
