import java.util.Scanner;
public class KullanıcıŞifreYenileme {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        String userName = scan.nextLine();
        System.out.print("Lütfen şifrenizi giriniz: ");
        String password = scan.nextLine();

        if(userName.equals("efeugur") && password.equals("21efe2121")){
            System.out.println("Başarılı bir şekilde giriş yaptınız: ");
        }else{
            System.out.println("Kullanıcı adı ya da şifre hatalı.");
            System.out.print("Şifrenizi değiştirmek ister misiniz? ");
            String answer = scan.nextLine();
            if(answer.equals("evet")){
                System.out.print("Oluşturmak istediğiniz yeni şifreyi giriniz: ");
                String password2 = scan.nextLine();
                if(password2.equals("21efe2121")){
                    System.out.print("Yeni şifreniz eski ile aynı olamaz. Lütfen başka bir şifre giriniz. ");
                    String password3 = scan.nextLine();
                }else{
                    System.out.println("Şifreniz başarlı bir şekilde değiştirilmiştir.");
                }
            }else if(answer.equals("hayır")){
                System.out.println("Sistemden çıkış yapılıyor...");
            }
        }
        }

    }
