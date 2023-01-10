import java.util.Scanner;
public class ödev1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir n değeri giriniz");
        int n = input.nextInt();
        int t=0;
        int[][]A=new int[n][n];
        System.out.println("a matrisi");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("a matrisinin "+i+". satırı "+j+".sütunu");
                A[i][j]=input.nextInt();
            }
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(A[i][j]+" "); 
            }
             System.out.println();
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
              if((i+j)<(n-1)){
                 t+=A[i][j];
              }
            }
         }
         System.out.println("yedek köşegen üstünde kalanların toplamı = "+t);
    }
}


