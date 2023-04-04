import java.util.Random;
import java.util.Scanner;

public class soruTahminOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(101); // 0-100 arası rastgele sayı üret

        System.out.println("0-100 arasında bir sayı tahmin edin.");

        while (true) {
            System.out.print("Tahmininiz: ");
            int guess = input.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Daha büyük bir sayı tahmin edin.");
            } else {
                System.out.println("Daha küçük bir sayı tahmin edin.");
            }
        }
    }
}
