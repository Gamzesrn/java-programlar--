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
public class ödev3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen kenar1 giriniz");
        int kenar1=input.nextInt();
        System.out.println("lütfen kenar2 giriniz");
        int kenar2=input.nextInt();
        System.out.println("lütfen kenar3 giriniz");
        int kenar3=input.nextInt();
        if(kenar1==kenar2&&kenar1==kenar3){
          System.out.println("eşkenar üçgendir");
        }
        else if(kenar1==kenar2&& kenar1!=kenar3){
            System.out.println("ikizkenar üçgendir");
        }
        else if (kenar2==kenar3&& kenar2!=kenar1){
            System.out.println("ikizkenar üçgendir");
        }
        else if (kenar3==kenar1&& kenar3!=kenar2){
            System.out.println("ikizkenar üçgendir");
        }
        else if(kenar1!=kenar2&& kenar1!=kenar3){
            System.out.println("çeşitkenar üçgendir");
        }
        
        
    }
    
}
