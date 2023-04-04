import java.util.Scanner;

public class palindromSayıKontrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " palindromik bir kelime.");
        } else {
            System.out.println(word + " palindromik bir kelime değil.");
        }
    }

    public static boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
