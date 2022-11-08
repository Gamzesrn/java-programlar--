/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 adım1= başla
 adım2= lütfen bir kütle giriniz
 adım3= lütfen bir hız giriniz
 adım4= lütfen bir yükseklik giriniz
 adım5= kinetik enerji =1/2*m*v^2;
 adım6= potansiyel enerji =m*g*h;
 adım7= kinetik ve potansiyel enerjiyi yazdır 
 adım8= bitir
 */
import java.util.Scanner;
public class homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        System.out.println("Lütfen bir kütle giriniz");
        int m=input.nextInt();
        System.out.println("Lütfen bir yükseklik giriniz");
        int h=input.nextInt();
        System.out.println("Lütfen bir hız giriniz");
        int v=input.nextInt();
        int g=10;
        double ep =m*g*h;
        double ek =(m*v*v)/2;
        System.out.println("potansiyel enerji="+ep+" kinetik enerji="+ek);
        
    }
    
}
