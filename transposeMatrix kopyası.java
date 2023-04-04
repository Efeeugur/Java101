import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan matris boyutlarını al
        System.out.print("Matrisin satır sayısını girin: ");
        int rows = input.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int cols = input.nextInt();

        // Matrisi oluştur
        int[][] matrix = new int[rows][cols];

        // Kullanıcıdan matris elemanlarını al
        System.out.println("Matrisin elemanlarını girin: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Transpozunu al ve ekrana yazdır
        int[][] transposedMatrix = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Matrisin transpozu:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
