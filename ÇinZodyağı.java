package Java101;
import java.util.Scanner;

public class ÇinZodyağı {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen dğum yılınızı giriniz. ");
        int yıl = scan.nextInt();
        if(yıl%12==0){
            System.out.println("Çin zodyağı burcunuz: Maymun");
        }
        if(yıl%12==1){
            System.out.println("Çin zodyağı burcunuz: Horoz");
        }
        if(yıl%12==2){
            System.out.println("Çin zodyağı burcunuz: Köpek");
        }
        if(yıl%12==3){
            System.out.println("Çin zodyağı burcunuz: Domuz");
        }
        if(yıl%12==4){
            System.out.println("Çin zodyağı burcunuz: Fare");
        }
        if(yıl%12==5){
            System.out.println("Çin zodyağı burcunuz: Öküz");
        }
        if(yıl%12==6){
            System.out.println("Çin zodyağı burcunuz: Kaplan");
        }
        if(yıl%12==7){
            System.out.println("Çin zodyağı burcunuz: Tavşan");
        }
        if(yıl%12==8){
            System.out.println("Çin zodyağı burcunuz: Ejderha");
        }
        if(yıl%12==9){
            System.out.println("Çin zodyağı burcunuz: Yılan");
        }
        if(yıl%12==10){
            System.out.println("Çin zodyağı burcunuz: At");
        }
        if(yıl%12==11){
            System.out.println("Çin zodyağı burcunuz: Koyun");
        }
    }
}
