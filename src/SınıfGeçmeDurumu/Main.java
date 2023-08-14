package SınıfGeçmeDurumu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, ortak=0, sayi=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen matematik notunuzu giriniz: ");
        matematik = scanner.nextInt();
        if (matematik>0 && matematik<=100){
            ortak+=matematik;
            sayi++;
        }
        System.out.println("Lütfen fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();
        if (fizik>0 && fizik<=100){
            ortak+=fizik;
            sayi++;
        }
        System.out.println("Lütfen türkçe notunuzu giriniz: ");
        turkce = scanner.nextInt();
        if (turkce>0 && turkce<=100){
            ortak+=turkce;
            sayi++;
        }
        System.out.println("Lütfen kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();
        if (kimya>0 && kimya<=100){
            ortak+=kimya;
            sayi++;
        }
        System.out.println("Lütfen müzik notunuzu giriniz: ");
        muzik = scanner.nextInt();
        if (muzik>0 && muzik<=100){
            ortak+=muzik;
            sayi++;
        }
        double average =ortak / sayi;

        if (average<55){
            System.out.println("Kaldınız.");
        }else {
            System.out.println("Geçtiniz.");

        }
        System.out.println("Ortalamanız: " + average);
    }
}