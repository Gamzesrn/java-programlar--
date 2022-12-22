import java.util.Scanner;
public class girilenkelimeninharflerinivealfabedekiyerlerikadaryıldızyazanprogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen büyük harflerle bir kelime giriniz");
        String txt=input.nextLine();
        for (int i = 0; i <=txt.length()-1; i++) {
            System.out.print(txt.charAt(i)+" -> ");
            for (int j = 1; j <=txt.charAt(i)-64; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
