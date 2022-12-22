import java.util.Scanner;
public class girilenkelimeninsesliharflerindenvesessizharflerindenayrıkelimeleryazanprogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char[]sesli={'a','e','o','u','ö','ü','i','ı'};
        System.out.println("lütfen küçük harflerle bir kelime giriniz");
        String txt=input.nextLine();
        String k1="",k2="";
        int s;
        for (int i = 0; i <txt.length(); i++) {
            s=0;
            for (int j = 0; j < 8; j++) {
                if (txt.charAt(i)==sesli[j]) {
                    s=1;
                    break;
                }
            }
            if (s==1) {
              k1+=txt.charAt(i);
            }
            else{
              k2+=txt.charAt(i);
            }
        }
        System.out.println("sesli harflerden oluşan kelime: "+k1);     
        System.out.println("sessiz harflerden oluşan kelime: "+k2); 
    }
}
