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

public class kendim2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println(" dikkat = bölme işlemi seçtiyseniz sıfırdan farklı sayı giriniz");
        System.out.println("Lütfen yaptırmak istediğiniz işlemi seçiniz (1 : + ,2 : -,3 : *,4 : /)");
        double islem=input.nextDouble();
        System.out.println("birinci sayıyı giriniz ");
        int sayi1=input.nextInt();
        System.out.println("ikinci sayıyı giriniz ");
        int sayi2=input.nextInt();
        System.out.println("üçüncü sayıyı giriniz ");
        int sayi3=input.nextInt();
        if (islem == 1) {
            islem =sayi1+sayi2+sayi3;
            System.out.println("sonuç= "+islem);
        }
        else if (islem==2) {
            islem =sayi1-sayi2-sayi3;
            System.out.println("Sonuç= "+islem);
        }
        else if (islem==3) {
            islem=sayi1*sayi2*sayi3;
            System.out.println("Sonuç= "+islem);
        }
        else if (islem==4) {
            islem=sayi1/sayi2/sayi3;
            System.out.println("Sonuç= "+islem);        
        } 
        else 
        {
            System.out.println(" lütfen işlemi dikkatli seçiniz veya sayıları değiştiriniz");
        }
        
    }
    
}
