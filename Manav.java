package Java101;
import java.util.Scanner;

public class Manav {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Double armut = 2.14;
        Double elma = 3.67;
        Double domates = 1.11;
        Double muz = 0.95;
        Double patlıcan = 5.00;

        System.out.print("Lütfen aldığınız armut kilogramını giriniz: ");
        int armutkg = scan.nextInt();
        System.out.print("Lütfen aldığınız elma kilogramını giriniz: ");
        int elmakg = scan.nextInt();
        System.out.print("Lütfen aldığınız domates kilogramını giriniz: ");
        int domateskg = scan.nextInt();
        System.out.print("Lütfen aldığınız muz kilogramını giriniz: ");
        int muzkg = scan.nextInt();
        System.out.print("Lütfen aldığınız patlıcan kilogramını giriniz: ");
        int patlıcankg = scan.nextInt();

        Double toplamtutar = (armut*armutkg) + (elma*elmakg) + (domates*domateskg) + (muz*muzkg) + (patlıcan*patlıcankg);
        System.out.print("Ürünlerin toplam tutarı: " + toplamtutar);

    }
}
