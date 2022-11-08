/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
  adım1:başla
  adım2:lütfen yarıçap giriniz
  adım3:hacim=4/3*π*r^3
  adım4:alan=4*π*r^2
  adım5:alanı ve hacmi yazdır
  adım6:bitir
 */

import java.util.Scanner;
import java.lang.*;
public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yarıçap giriniz");
        int r=input.nextInt();
        
        double hacim=4/3*r*r*r*Math.PI;
        double alan=4*r*r*Math.PI;
        System.out.println("hacim= "+hacim+"alan= "+alan);
        
        
        
    }
    
}
