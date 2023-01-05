package Java101;
import java.util.Scanner;
import java.util.stream.IntStream;

public class üçgenalan{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Üçgenin 1. kenarını giriniz: ");
        Double a = scan.nextDouble();
        System.out.println("Üçgenin 2. kenarını giriniz: ");
        Double b = scan.nextDouble();
        System.out.println("Üçgenin 3. kenarını giriniz: ");
        Double c = scan.nextDouble();

        Double u = (a+b+c)/2;
        Double A; 
        A = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Kenar uzunlukları girilen üçgenin alanı: " + A);




    }
}
