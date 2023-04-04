public class şekilOluşturma {
    public static void main(String[] args) {
        int n = 7;
        char[][] b = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || ((i == 0 || i == n / 2 || i == n - 1) && j < n - 2)
                        || (i > 0 && i < n / 2 && j == n - 3 - i)
                        || (i > n / 2 && i < n - 1 && j == i - 2)) {
                    b[i][j] = '*';
                } else {
                    b[i][j] = ' ';
                }
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
