public class basamaklarıtoplamıfibonaccisayısıolan0ile99arasıtamsayılar {
    public static void main(String[] args) {
        int s=0;
        System.out.print("0 - 99 aralığında rakamları toplamı fibonacci sayısı olan sayılar : ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                s=i+j;
                if(s==1  || s==2 || s==3 ||s==5||s==8  ||s==13){     
                    System.out.print(10*i+j+" ");
                }
                else{
                }
            }
        }
    }
}
