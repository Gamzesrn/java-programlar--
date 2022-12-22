import java.util.Scanner;
public class girilenkelimeninharfleriniterstenyazanprogram {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz");
        String txt=input.nextLine();
        for (int i = txt.length()-1; i>=0 ; i--) {
            if(i!=0){
                System.out.print(txt.charAt(i)+",");
            }
            else{
                System.out.print(txt.charAt(i));
            }
        }
        
    }
 
}
