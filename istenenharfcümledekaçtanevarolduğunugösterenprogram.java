import java.util.Scanner;
public class istenenharfcümledekaçtanevarolduğunugösterenprogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String txt=input.nextLine();
        System.out.println("lütfen bir harf giriniz");
        char ch=input.nextLine().charAt(0);
        int s=0;
        for (int i = 0; i < txt.length(); i++) {
            if(txt.charAt(i)==ch){
                System.out.print((i+1)+",");
                s++;
            }
        }
        System.out.println("\n"+ch+" harfi cümlede "+s+" kere geçmektedir");
    }
}
