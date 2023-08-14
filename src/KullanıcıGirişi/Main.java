package KullanıcıGirişi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name, password;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz: ");
        name = scanner.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        password = scanner.nextLine();


        if (name.equals("patika") && password.equals("java101")){
            System.out.println("Başarıyla giriş yaptınız.");
        }else if(name.equals("patika")){
            System.out.println("Şifrenizi mi unuttunuz? Sıfırlamak ister misiniz? Evet veya Hayır yazmanız yeterlidir.");
            String answer = scanner.nextLine();
            if (answer.equals("Evet")){
                System.out.println("Yeni şifrenizi giriniz: ");
                String newpass = scanner.nextLine();
                if (newpass.equals("java101")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }else if(answer.equals("Hayır")){
                System.out.println("Tekrar denemeye");
            }
        }else if (password.equals("java101")){
            System.out.println("Kullanıcı adınız yanlış, lütfen tekrar deneyiniz.");
        }else {
            System.out.println("Girdiğiniz bilgiler hatalı.");
        }
    }
}