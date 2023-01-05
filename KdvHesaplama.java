package Java101;
import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ürünün tutarını giriniz: ");
        Double uruntutar = scan.nextDouble();
        System.out.println("Ürünün kdv\'siz fiyatı: " + uruntutar);
        
        boolean yuksekOran = (uruntutar<1000);
        boolean dusukOran = (uruntutar>1000);
        double kdvDegeri = (yuksekOran)? 18.0 : 8.0;

        Double sonuc1 = ((uruntutar * kdvDegeri/100) + uruntutar);
        System.out.println("Ürünün kdv\'li tutarı: " + sonuc1 + "TL");

        Double sonuc2 = (uruntutar*kdvDegeri/100);
        System.out.println("Kdv tutarı: " + sonuc2);

        Double sonuc3 = (kdvDegeri);
        System.out.println("Kdv değeri: " +"%" + sonuc3);





    }
}
