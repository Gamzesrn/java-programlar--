import java.util.Scanner;
public class pythagoreantriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir pozitif tam sayı giriniz");
        int n = input.nextInt();
        int k;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n - i; j++) {
                k = n - (i + j);
                if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
                    System.out.println(i + " " + j + " " + k + " " + (i * j * k));
                }
            }
        }
    }
}
