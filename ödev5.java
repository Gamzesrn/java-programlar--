import java.util.Scanner;
public class ödev5 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("bir sayı giriniz");
        int n = input.nextInt();
        int[][]A=new int[n][n];
        int []B=new int[n];
        System.out.println("a matrisi");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a matrisinin "+i+". satırı "+j+".sütunu ");
                A[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i]+=A[i][j];
            }
        }
        System.out.println("b dizisi");
        for (int i = 0; i <n; i++) {
            System.out.print(B[i]+" ");
        }
        System.out.println();
    }
}
