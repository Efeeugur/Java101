import java.util.Arrays;
import java.util.Scanner;

public class dizidekiElemanlarıSıralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Dizinin sıralanmış hali: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
