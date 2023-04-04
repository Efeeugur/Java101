import java.util.*;

public class tekrarEdenCiftSayılar {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 5, 14, 2, 4, 8, 14};
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> result = new HashSet<Integer>();
        
        for (int i : arr) {
            if (!set.add(i)) {
                result.add(i);
            }
        }
        
        System.out.println("Dizideki tekrar eden çift sayılar:");
        for (int i : result) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
