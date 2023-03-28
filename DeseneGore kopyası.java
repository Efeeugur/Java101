import java.util.Scanner;
public class DeseneGore {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scan.nextInt();
        recursiveMethod(n);
    }
    public static void recursiveMethod(int n) {
        System.out.print(n + " ");
        if (n > 0) {
            recursiveMethod(n - 5);
        }
        System.out.print(n + " ");
    }
    
}
