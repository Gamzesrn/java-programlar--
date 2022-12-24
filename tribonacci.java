import java.util.Scanner;
public class tribonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen bir değer giriniz");
        int n=input.nextInt();
        int a=1,b=1,c=2,d;
        System.out.print(a+" "+b+" "+c+" ");
        for (int i = 1; i <= n-3; i++) {
            d=a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
    }
}
