/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 adım1=başla
 adım2=lütfen bir direnç giriniz
 adım3=lütfen bir akım giriniz
 adım4=gerilim=direnç*akım
 adım5=gerilimi yazdır
 adım6=bitir
 */
import java.util.Scanner;
public class homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        System.out.println("Lütfen bir direnç giriniz");
        int direnç=input.nextInt();
        System.out.println("Lütfen bir akım giriniz");
        int akım=input.nextInt();
        int gerilim=direnç*akım;
        System.out.println("gerilim="+gerilim);
        
    }
    
}
