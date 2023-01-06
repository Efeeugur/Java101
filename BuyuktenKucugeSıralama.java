package Java101;
import java.util.Scanner;

public class BuyuktenKucugeSıralama {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz. ");
        int a = scan.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz. ");
        int b = scan.nextInt();

        System.out.print("Lütfen üçüncü sayıyı giriniz. ");
        int c = scan.nextInt();

        if((a > b) && (a > c)){
            if(b>c){
                System.out.println("a > b > c");
            }else{
                System.out.println("a > c > b");
            }
        }else if((b > a) && (b > c)){
            if(a > c){
                System.out.println("b > a > c");
            }else{
                System.out.println("b > c > a");
            }
        }else if((c > a) && (c > b)){
            if(a > b){
                System.out.println("c > a > b");
            }else{
                System.out.println("c > b > a");
            }
        }
    }
}
