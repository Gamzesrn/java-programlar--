/*

    *
   **
  *** 
 ****
***** 


 */
public class yıldız18 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
