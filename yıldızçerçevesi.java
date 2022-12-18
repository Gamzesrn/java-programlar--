import java.util.Scanner;
public class yıldızçerçevesi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen çerçeve kenar uzunluğunu giriniz ");
        int kenar =input.nextInt();
        
        for (int i = 1; i <= kenar; i++) {
            if(i==1||i==kenar){
                for (int j = 0; j < kenar; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else 
            {
                System.out.print("*");
                for (int j = 0; j < kenar-2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
