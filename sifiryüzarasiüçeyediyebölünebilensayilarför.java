/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gamze
 */
public class sifiryüzarasiüçeyediyebölünebilensayilarför {
    public static void main(String[] args) {
        // 3 e ve 7 ye tam bölünmesi demek 21 e tam bölünmesi demektir 
        for (int i = 0; i < 100; i++) {
            if(i%3==0&&i%7==0)
            {
                System.out.println(i+" sayısı hem 3 e hem de 7 ye tam bölünebilen bir sayıdır");
            }
            
        }
        System.out.println("belirtilen aralıktaki yukarıda yazılan bu sayılar dışında kalan sayılar aynı anda 3 e ve 7 ye tam bölünemezler ");
    }
}
