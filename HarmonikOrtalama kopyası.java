public class HarmonikOrtalama {
    public static void main(String[] args) {
        // Örnek bir dizi oluşturuluyor
        double[] numbers = { 2, 4, 6, 8, 10 };

        // Toplam değişkeni tanımlanıyor
        double total = 0;

        // Dizideki elemanların tersleri alınarak harmonik seri hesaplanıyor
        for (double number : numbers) {
            total += 1 / number;
        }

        // Harmonik ortalamayı hesaplayarak ekrana yazdırılıyor
        double harmonicMean = numbers.length / total;
        System.out.println("Dizinin harmonik ortalaması: " + harmonicMean);
    }
}
