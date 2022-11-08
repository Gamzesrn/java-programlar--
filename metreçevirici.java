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
public class hmewrk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double metre,secenek,sonuc;
        System.out.println("lütfen bir metre giriniz ");
        metre =input.nextDouble();
        System.out.println(" * İŞLEM MENÜSÜ * ");
        System.out.println("1- milimetreye çevir ");
        System.out.println("2- santimetreye çevir ");
        System.out.println("3- desimetreye çevir ");
        System.out.println("4-kilometreye çevir ");
        secenek=input.nextDouble();
        if (secenek==1) {
            sonuc=metre*1000;
            System.out.println("Sonuç= "+sonuc);
        }
        else if (secenek==2) {
            sonuc=metre*100;
            System.out.println("Sonuç= "+sonuc);
        }
        else if (secenek==3) {
            sonuc=metre*10;
            System.out.println("sonuç= "+sonuc);
              
        }
        else if (secenek==4) {
            sonuc=metre/1000;
            System.out.println("sonuç= "+sonuc);
            
        }
        else{
            System.out.println(" tekrar sayı giriniz ");
        }
    }
    
}
