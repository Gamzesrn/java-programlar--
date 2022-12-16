
import java.util.Scanner;
import java.util.Random;

public class example {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random r=new Random();
        // n pozitif tam sayı değerini consoldan almak
        int N;
        do {            
              System.out.println("lütfen pozitif bir N tamsayı değeri giriniz");
              N =input.nextInt();
        } while (0>N);
        // N uzunluğunda dizi tanımla
        int[]randomsayi=new int [N];
        // randomsayi dizisine rastgele  0-99 arası sayılar atama
       for(int i=0;i<randomsayi.length;i++)
       {
           randomsayi[i]=r.nextInt(100);
           System.out.println((i+1)+".inci sayı: "+randomsayi[i]);
       }
       //random sayı dizisinde minimum değeri bulma
            int minsayi=randomsayi[0];//0.indeksteki elemanın minimum olduğunu varsayar
            int minindex=0;
            int maxsayi=randomsayi[0];
            int maxindex=0;
            for(int i=1;i<randomsayi.length;i++)
            {
                if(randomsayi[i]<minsayi)//eğer i inci indeks değeri min den küçükse
                {
                    minsayi =randomsayi[i];//i inci indeks değerini min e atar
                    minindex=i;
                    
                }
                if(randomsayi[i]>maxsayi)
                {
                    maxsayi=randomsayi[i];
                    maxindex=i;
                }
            }
            System.out.println("min değer= "+minsayi);
            System.out.println("minimum eleman indexi= "+minindex);
            System.out.println("max değer= "+maxsayi);
            System.out.println("maximum eleman indexi= "+maxindex);
    }
}
