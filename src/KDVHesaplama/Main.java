package KDVHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miktarı giriniz:");
        int money = input.nextInt();
        double kdv = 0.18;
        double kdv2 = 0.8;
        double sonuc1 = money * kdv;
        double sonuc2 = money * kdv2;
        boolean kosul1 = money > 0 & money < 1000;

        double sonuc = kosul1 ? sonuc1 : sonuc2;
        System.out.println(sonuc);
    }
}

