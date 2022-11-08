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
public class week5homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("bir c sayısı giriniz");
        int c=input.nextInt();
        boolean boot=true;
        for (int a = 1; a<= c; a++) {
          for(int b=1;b<=c;b++)
          {
              
            if (c==(a*a+b*b)){
                System.out.println("yazdırılabilir");
                System.out.println(a+" -"+b);
                boot=false;
                a=c+1;
                b=c+1;
            }
          }
        }
            if(boot==true)
            {
                System.out.println("yazdırılamaz");
               
                        
            }
            
           
    }
        
    }
    

