package Java101;

import java.util.Scanner;
public class OrtalamaHesaplama{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        int mat = scan.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        int fızık = scan.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        int kımya = scan.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        int turkce = scan.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        int tarıh = scan.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        int muzık = scan.nextInt();
        int toplam = (mat+fızık+kımya+turkce+tarıh+muzık);
        double ortalama = (double)(toplam/6);
        System.out.println("Not ortalamanız: " + ortalama);

        String durum = (ortalama>=60) ?  "Sınıfı geçtiniz." : "Kaldınız.";
        System.out.println(durum);
    }
}