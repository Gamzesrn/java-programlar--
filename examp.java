
public class examp {
    public static void main(String[] args) {
        int[]A={2,4,6};
        int[]B={1,3,5};
        int[][]C=new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                C[i][j]=A[i]*B[j];    
            }
        }
        for (int i = 0; i < A.length; i++) {
          for (int j = 0; j < B.length; j++) {
                   System.out.print("c dizisi = "+C[i][j]+ " ");
          }
          System.out.println("");
        }
        
    }
}



