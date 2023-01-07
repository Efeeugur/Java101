package Java101;
import java.util.Scanner;

public class UcakBıleti {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi km cinsinden giriniz. ");
        int km = scan.nextInt();
        System.out.print("Lütfen yaşınızı giriniz. ");
        int yas = scan.nextInt();
        if(yas < 0){
            System.out.print("Hatalı veri girdiniz. ");
            System.out.print("Lütfen yaşınızı tekrar giriniz. ");
            yas = scan.nextInt();
        }
        System.out.print("Lütfen Yolculuk tipinizi giriniz: 1 => Tek yön 2=>Gidiş Dönüş ");
        int yolculuktıpı = scan.nextInt();
        if(yolculuktıpı!=1 && yolculuktıpı!=2){
            System.out.print("Hatalı veri girdiniz: ");
            System.out.print("Lütfen yaşınızı tekrar giriniz. ");
            yolculuktıpı = scan.nextInt();
        }
        Double tutar = (km*0.1);
        if(yolculuktıpı==2){
            tutar= tutar-((tutar*20)/100);
        }
        if(yas <= 12){
            System.out.println("Yaşınız 12'den küçük olduğu için %50 indirimö kazandınız. ");
            tutar = (tutar-((tutar*50)/100));
            System.out.print("Bilet fiyatınız: " + tutar + "Tl" );
        }else if(yas >=12 && yas <= 24){
            System.out.println("Yaşınız 12 ile 24 arasında olduğu için %10 indirim kazandınız. ");
            tutar = (tutar-((tutar*10)/100));
            System.out.print("Bilet fiyatınız: " + tutar + "Tl" );
        }else if(yas > 65){
            System.out.println("Yaşınız 65'ten büyük olduğu için %30 indirim kazandınız. ");
            tutar = (tutar-((tutar*30)/100));
            System.out.print("Bilet fiyatınız: " + tutar + "Tl" );
        }else{
            System.out.print("Bilet fiyatınız: " + tutar + "Tl" );
        }
    }
}
