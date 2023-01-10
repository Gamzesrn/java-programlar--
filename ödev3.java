import java.util.Scanner;
public class ödev3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir n değeri giriniz");
        int n = input.nextInt();
        int[][]A=new int[n][n];
        int t=0;
        System.out.println("a matrisi");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("A matrisinin"+ i+".satırı "+j+".sütunu ");
                A[i][j]=input.nextInt();
            }
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(A[i][j]+" ");
            }
             System.out.println();
         }
         for (int i = 0; i <n; i++) {
             for (int j = 0; j <n; j++) {
                 if(i==(n-2)&&j!=(n-1)||j==(n-2)&&i!=(n-1)){
                     t+=A[i][j];
                 }
                 if(i==(n-2)&&j==(n-2)){
                     t+=A[i][j];
                 }
             }
         }
         System.out.println("toplam= "+t);    
    }
}
