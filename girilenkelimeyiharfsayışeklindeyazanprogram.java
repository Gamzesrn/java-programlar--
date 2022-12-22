import java.util.Scanner;
public class girilenkelimeyiharfsayışeklindeyazanprogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz");
        String txt = input.nextLine();
        for (int i = 0; i <= txt.length()-1; i++) {
            System.out.print(txt.charAt(i));
            System.out.print((i+1));
        }
    }
}
//indis ilgili harfin yerini gösterir, adres bilgisidir
