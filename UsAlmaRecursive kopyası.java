import java.util.Scanner;

public class UsAlmaRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üssü alınacak sayıyı girin:");
        double taban = scanner.nextDouble();

        System.out.println("Üs değerini girin:");
        int us = scanner.nextInt();

        double sonuc = usAlma(taban, us);

        System.out.println(taban + " üzeri " + us + " = " + sonuc);
    }

    public static double usAlma(double taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us > 0) {
            return taban * usAlma(taban, us - 1);
        } else {
            return 1 / (taban * usAlma(taban, -us - 1));
        }
    }
}
