import java.util.Scanner;
public class üçgenselsayılar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir terim sayısı giriniz");
        int n=input.nextInt();
        for (int i = 1; i <=n; i++){
            int u=i*(i+1)/2;
            System.out.print(u+" ");
        }
    }
}
