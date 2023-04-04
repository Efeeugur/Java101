import java.util.HashMap;
import java.util.Scanner;

public class diziFrekans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (frequencyMap.containsKey(key)) {
                frequencyMap.put(key, frequencyMap.get(key) + 1);
            } else {
                frequencyMap.put(key, 1);
            }
        }

        System.out.println("Dizideki elemanların frekansları:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " : " + frequencyMap.get(key));
        }
    }
}
