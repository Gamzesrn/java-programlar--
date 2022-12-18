import java.util.Scanner;
public class yıldızlarlakareyapanprogram {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen satır sayısını giriniz");
        int row=input.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
