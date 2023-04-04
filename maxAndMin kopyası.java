import java.util.Arrays;
import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        // Dizi oluşturuluyor ve elemanlar ekleniyor
        int[] numbers = {10, 5, 25, 30, 20};

        // Kullanıcıdan bir sayı isteniyor
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int inputNumber = scanner.nextInt();

        // Dizideki elemanların en yakınlarını bulmak için sıralıyoruz
        Arrays.sort(numbers);

        // En yakın sayıları tutmak için iki değişken tanımlıyoruz
        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        // Döngü kullanarak dizideki elemanları kontrol ediyoruz
        for (int number : numbers) {
            if (number < inputNumber && number > closestSmaller) {
                closestSmaller = number;
            } else if (number > inputNumber && number < closestLarger) {
                closestLarger = number;
            }
        }

        // En yakın sayıları ekrana yazdırıyoruz
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
    }
}
