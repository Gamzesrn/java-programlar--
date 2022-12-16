/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gamze
 */
public class fibönaccidöngü {
    public static void main(String[] args) {
        //fibonacci: 1 1 2 3 5 8 13 21 34 ...
        //          s1 s2 s3
        //             s1 s2 s3
        //                s1 s2 s3
        
            int s1=1;
            int s2=1;
            int s3;
            System.out.println(s1);
            System.out.println(s2);
            for (int j = 0; j < 10; j++) {
                s3=s1+s2;
                s1=s2;
                s2=s3;
                // her adımda kaydırma işlemi olmalı 
                // bu iki satır kaydırmayı sağlar
                System.out.println(s3);
            }
        
    }
}
