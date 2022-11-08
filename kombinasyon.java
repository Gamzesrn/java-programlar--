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
public class kombinasyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kümeye ait eleman sayısını giriniz : ");
        int n=input.nextInt();
        System.out.print("Lütfen belirlemek istediğiniz kombinasyon sayısını giriniz : ");
        int r=input.nextInt();
        int nf=1,rf=1,nrf=1;
        for (int i = 1; i <= n; i++) {
            nf*=i;
        }
        for (int i = 1; i <= r; i++) {
            rf*=i;
        }
        for(int i=1;i<=(n-r);i++){
            nrf*=i;
        }
        int k=nf/(rf*nrf);
        System.out.println(n+" in "+r+" li kombinasyonu:"+ k );
        
        
    }
    
}
