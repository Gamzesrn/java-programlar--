import java.util.Scanner;
public class heterometriksayılar {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen bir pozitif tam sayıı giriniz");
        int n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print(i+"."+(i+1)+"="+i*(i+1)+" , ");
        }
    }
}
