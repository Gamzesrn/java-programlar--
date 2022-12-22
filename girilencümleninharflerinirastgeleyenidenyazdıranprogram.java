import java.util.Scanner;
import java.util.Random;
public class girilencümleninharflerinirastgeleyenidenyazdıranprogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz");
        String txt=input.nextLine();
        Random r=new Random();
        int[]randomsayi=new int [10];
        for(int i=0;i<=txt.length()-1;i++){
            for (int j = txt.length()-1; j >=0; j--) {
                  randomsayi[i]=r.nextInt(10);
            }
            if(randomsayi[i]%2==0){
                System.out.print(Character.toLowerCase(txt.charAt(i)));
            }
            else{
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }
        
        }
    }

}