package Java101;
import java.util.Scanner;

public class DersNotuOrtalaması {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz. ");
        int matematıkgrade = scan.nextInt();
        if(matematıkgrade<0 || matematıkgrade>100){
            System.out.print("Lütfen 0 ile 100 arasında bir sayı giriniz. ");
            matematıkgrade = scan.nextInt();
        }
        System.out.print("Lütfen fizik notunuzu giriniz. ");
        int fızıkgrade = scan.nextInt();
        if(fızıkgrade<0 || fızıkgrade>100){
            System.out.print("Lütfen 0 ile 100 arasında bir sayı giriniz. ");
            fızıkgrade = scan.nextInt();
        }
        System.out.print("Lütfen türkçe notunuzu giriniz. ");
        int turkcegrade = scan.nextInt();
        if(turkcegrade<0 || turkcegrade>100){
            System.out.print("Lütfen 0 ile 100 arasında bir sayı giriniz. ");
            turkcegrade = scan.nextInt();
        }
        System.out.print("Lütfen kimya notunuzu giriniz. ");
        int kımyagrade = scan.nextInt();
        if(kımyagrade<0 || kımyagrade>100){
            System.out.print("Lütfen 0 ile 100 arasında bir sayı giriniz. ");
            kımyagrade = scan.nextInt();
        }
        System.out.print("Lütfen müzik notunuzu giriniz. ");
        int muzıkgrade = scan.nextInt();
        if(muzıkgrade<0 || muzıkgrade>100){
            System.out.print("Lütfen 0 ile 100 arasında bir sayı giriniz. ");
            muzıkgrade = scan.nextInt();
        }
        Double ortalama = (double)((matematıkgrade + fızıkgrade + turkcegrade + kımyagrade + muzıkgrade) / 5);

        System.out.println("Not ortalamanız: " + ortalama);
        if(ortalama > 55){
            System.out.println("Tebrikler sınıfı geçtiniz. ");
        }else if(ortalama < 55){
            System.out.println("Sınıfta kaldınız. ");
        }






    }
}
