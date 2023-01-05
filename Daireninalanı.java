package Java101;
import java.util.Scanner;

public class Daireninalanı {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını(r) giriniz: ");
        int r = scan.nextInt();
        System.out.print("Dairenin merkez açı ölçüsünü giriniz: ");
        Double a = scan.nextDouble();
        Double pi = 3.14;
        Double alan = (pi* (r*r) * a) / 360;
        System.out.println("Yarıçapı girilen dairenin alanı: " + alan);
    }
}
