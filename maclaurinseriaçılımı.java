/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gamze
 */
import java.util.Scanner;
public class maclaurinseriaçılımı {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("bir x değeri giriniz");
       int x = input.nextInt();
       System.out.println("bir n değeri giriniz");
       int n =input.nextInt();
       double t=1, f=1;
       for(int i=1;i<n;i++)
 		{
 		    f=f*i;
 		    t=t+(Math.pow(x, i)/f);
 		}
		System.out.println("toplam="+t);  
    }
}
