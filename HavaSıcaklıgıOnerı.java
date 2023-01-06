package Java101;
import java.util.Scanner;

public class HavaSıcaklıgıOnerı {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        int temperature = scan.nextInt();

        if(temperature < 5){
            System.out.println("Hava soğuk olduğundan evde oturmanızı öneriririm. ");
        }else if(temperature <= 25){
            if(temperature <= 15){
                System.out.println("Spora gidebilirsiniz. ");
            }if(temperature >= 10 ){
                System.out.println("Arkadaşlarınız ile buluşabilirsiniz. ");
            }
        }else{
            System.out.println("Hava güzel pikniğe gidebilirsiniz. ");
        }
    }
}
