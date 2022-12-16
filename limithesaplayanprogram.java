
import java.util.Scanner;
public class limithesaplayanprogram {   
   public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir x değeri giriniz");
 	int x=input.nextInt();
	System.out.println("lütfen bir n değeri giriniz");
 	int n=input.nextInt();
        double sonuc;
        sonuc=Math.pow(1+(x/n), n);           
 	System.out.println("sonuç= "+sonuc);
    }
}
