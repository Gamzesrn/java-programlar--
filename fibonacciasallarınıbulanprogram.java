import java.util.Scanner;
public class fibonacciasallarınıbulanprogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir terim sayısı giriniz");
        int n=input.nextInt();
        int f1=1,f2=1,s2=0;
        int f3=f1+f2;
        f1=f2;
        f2=f3;
        int s1=0;
        for (int i = 2; i < f3-1; i++) {
            if (f3%i==0) {
                s1=s1+1;
            }
            else{
                
            }
        }
        if(s1==0){
            s2=s2+1;
            System.out.println(f3);
        }else if (s2<n) {
            
        }
        
        
    }
}
