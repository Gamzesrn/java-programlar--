import java.util.Scanner;
public class ödev4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int n=input.nextInt();
        int[][]A=new int[n][n];
        int [][]B=new int[n][n];
        System.out.println("a matrisi   ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a matrisinin "+i+". satırı "+j+". sütunu ");
                A[i][j]=input.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              if(i==j){
                   B[i][j]=A[i][j];
              }
            }
        }
        System.out.println("köşegen matrisi");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
         
    }
}
