/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gamze
 */
public class fibönaccidizi {
    public static void main(String[] args) {
        int fib[]=new int[10];// dizi tanımlama;
        fib[0]=1;// diziler 0 dan başlar 0 ıncı elemana değer atama
        fib[1]=1;//1.elemana değer atama
        for (int i = 0; i < 8; i++) {
            fib[i+2]=fib[i+1]+fib[i];  
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(fib[i]);
        }
        // ikiside aynı işlemi yapar.
        //for (int i = 2; i < 10; i++) {
        //    fib[i]=fib[i-1]+fib[i-2];    
        //}
       // for (int i = 0; i < 10; i++) {
        //     System.out.println(fib[i]);
        //}
    }
}
