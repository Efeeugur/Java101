package Java101;
import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int mounth, day;

        System.out.print("Dogdugunuz Ay :");
        mounth = input.nextInt();

        System.out.print("Dogdugunuz Gun :");
        day = input.nextInt();

        if ((mounth == 12) && (day >= 22) || ((mounth == 1) && (day <= 21))) {
            System.out.println("Oglak Burcu");
        } else if ((mounth == 1) && (day >= 22) || ((mounth == 2) && (day <= 19))) {
            System.out.println("Kova Burcu");
        } else if ((mounth == 2) && (day >= 20) || ((mounth == 3) && (day <= 20))) {
            System.out.println("Balik Burcu");
        } else if ((mounth == 3) && (day >= 21) || ((mounth == 4) && (day <= 20))) {
            System.out.println("Koc Burcu");
        } else if ((mounth == 4) && (day >= 21) || ((mounth == 5) && (day <= 21))) {
            System.out.println("Boga Burcu");
        } else if ((mounth == 5) && (day >= 22) || ((mounth == 6) && (day <= 22))) {
            System.out.println("Ikizler Burcu");
        } else if ((mounth == 6) && (day >= 23) || ((mounth == 7) && (day <= 22))) {
            System.out.println("Yengec Burcu");
        } else if ((mounth == 7) && (day >= 23) || ((mounth == 8) && (day <= 22))) {
            System.out.println("Aslan Burcu");
        } else if ((mounth == 8) && (day >= 23) || ((mounth == 9) && (day <= 22))) {
            System.out.println("Basak Burcu");
        } else if ((mounth == 9) && (day >= 23) || ((mounth == 10) && (day <= 22))) {
            System.out.println("Terazi Burcu");
        } else if ((mounth == 10) && (day >= 23) || ((mounth == 11) && (day <= 21))) {
            System.out.println("Akrep Burcu");
        } else if ((mounth == 11) && (day >= 22) || ((mounth == 12) && (day <= 21))) {
            System.out.println("Yay Burcu");
        } else if ((mounth == 12) && (day >= 22) || ((mounth == 1) && (day <= 21))) {
            System.out.println("Oglak Burcu");
    }
}
}
