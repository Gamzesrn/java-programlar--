import java.util.Scanner;
public class girilenkelimeyiikiyebölüpparçalarıterstenyazanprogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz");
        String txt=input.nextLine();
        int n=txt.length();
        for (int i =n/2-1; i>=0; i--) {
            System.out.print(txt.charAt(i));
        }
        for (int i =n-1; i>=n/2; i--) {    
           System.out.print(txt.charAt(i));
        }
    }
}
