package Java101;
import java.util.Scanner;

public class VucütKitleİndeksi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        Double boy = scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        int kılo = scan.nextInt();

        Double VKI = kılo/(boy * boy);
        System.out.println("Vucüt kilo indeksiniz: "+ VKI);

        
    }
}
