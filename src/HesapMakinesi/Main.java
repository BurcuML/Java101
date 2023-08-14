package HesapMakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz:");
        double num1 = scanner.nextDouble();
        System.out.println("İkinci sayıyı giriniz:");
        double num2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlem için numara seçiniz: ");
        System.out.println("1:Toplama" + " " + "2: Çıkarma"+  " " +"3:Bölme" + " " + "4: Çarpma");
        int choice = scanner.nextInt();
        double result;
        switch (choice){
            case 1:
                result = (num1 + num2);
                System.out.println("Toplam: " + result);
            break;
            case 2:
                result = (num1 - num2);
                System.out.println("Çıkarım: " + result);
                break;
            case 3:
                result = (num1 / num2);
                System.out.println("Bölüm: " + result);
                break;
            case 4:
                result = (num1 * num2);
                System.out.println("Çarpım: " + result);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Lütfen tekrar deneyiniz.");
        }

    }
}
