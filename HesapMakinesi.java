package Java101;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int n1 = scan.nextInt();
        System.out.print("İkinci sayıyı griiniz: ");
        int n2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: " );
        int select = scan.nextInt();

        switch(select){
            case 1:
                int toplam = n1+n2;
                System.out.print(n1 + " " + "ve" + " " + n2 + " " + "sayılarının toolamı: " + toplam);
                break;
            case 2:
                int fark = n1-n2;
                System.out.print(n1 + " " + "ve" + " " + n2 + " " + "sayılarının farkı :" + fark);
                break;
            case 3:
                int çarpım = n1*n2;
                System.out.print(n1 + " " + "ve" + " " + n2 + " " + "sayılarının çarpımı: " + çarpım);
                break;
            case 4:
                Double bölüm = (double)n1/n2;
                System.out.print(n1 + " " + "ve" + " " + n2 + " " + "sayılarının bölümü: " + bölüm);
                break;
            default:
                System.out.print("Lütfen 1 2 3 veya 4 rakımından birini seçiniz.");
                break;     


        }
    }
}
