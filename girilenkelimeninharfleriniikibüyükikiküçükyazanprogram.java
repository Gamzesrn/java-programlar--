import java.util.Scanner;
public class girilenkelimeninharfleriniikibüyükikiküçükyazanprogram {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz");
        String txt =input.nextLine();
        int s=0;
        for (int i = 0; i <txt.length(); i++) {
          int r=s%4;
            if (r<2) {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            } 
          else{
              System.out.print(txt.charAt(i));
          }
          s+=1;
        }
    }
}
