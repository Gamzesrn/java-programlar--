import java.util.Scanner;
public class girilenkelimeyiterstenbirküçükharfbirbüyükharfyazanprogram {
    public static void main(String[] args) {
        Scanner klavye =new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz");
        String txt =klavye.nextLine();
        int s=0;// sayacı index takibi için kullandım küçük büyük yazabilme takibini yapmak için
        for (int i = txt.length()-1; i >=0; i--) {
            if(s%2==0){
                System.out.print(Character.toLowerCase(txt.charAt(i)));
            }
            else{
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }
            s++;
        }
    }
}
