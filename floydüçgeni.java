import java.util.Scanner;
public class floydüçgeni {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir satır sayısı giriniz");
        int row=input.nextInt();
        System.out.println("FLOYD ÜÇGENİ");
        int s=1;
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(s+" ");
                s++;
            }
            System.out.println();
        }
    }
}
