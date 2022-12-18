import java.util.Scanner;
public class yıldızlarlakareyapımı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen satır sayısını giriniz");
        int row=input.nextInt();
        System.out.println("lütfen sütun sayısını giriniz");
        int column=input.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
