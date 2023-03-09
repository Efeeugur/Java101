import java.util.Scanner;
public class KatBulma {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                count++;
                sum += i;
            }
        }
        double average = (double) sum / count;
        System.out.println("0'dan " + n + " kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + average);
    }
}
