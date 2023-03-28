import java.util.Scanner;

public class AsalRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayıyı girin:");
        int sayi = scanner.nextInt();

        if (isAsal(sayi, sayi / 2)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }

    public static boolean isAsal(int sayi, int i) {
        if (i == 1) {
            return true;
        } else if (sayi % i == 0) {
            return false;
        } else {
            return isAsal(sayi, i - 1);
        }
    }
}
