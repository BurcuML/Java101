package UcakBiletiFiyatHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bilgi = new Scanner(System.in);
        System.out.println("Mesafeyi(km cinsinden) giriniz: ");
        int mesafe = bilgi.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        int yas = bilgi.nextInt();
        System.out.println("Yolculuk tipini (Tek Yön-(1), Gidiş-Dönüş-(2)) giriniz: ");
        int yoltip = bilgi.nextInt();

        double normaltutar = mesafe * 0.10;
        double yasindirimi;
        double tutar = 0;
        double ciftyonindirimi;
        double toplamtutar;

        if (mesafe > 0 && yas > 0) {

            if (yoltip == 1 || yoltip == 2) {

                if (yas < 12) {
                    yasindirimi = normaltutar * 0.50;
                    tutar = normaltutar - yasindirimi;
                    System.out.println("Tutar: " + tutar);
                    if (yoltip == 2) {
                        ciftyonindirimi = tutar * 0.20;
                        toplamtutar = (tutar-ciftyonindirimi)* 2;
                        System.out.println("Çift yön tutar: " + toplamtutar);
                    }
                } 
                else if (yas < 24) {
                    yasindirimi = normaltutar * 0.10;
                    tutar = normaltutar - yasindirimi;
                    System.out.println("Tutar: " + tutar);
                    if (yoltip == 2) {
                        ciftyonindirimi = tutar * 0.20;
                        toplamtutar = (tutar - ciftyonindirimi) * 2;
                        System.out.println("Çift yön tutar: " + toplamtutar);
                    }
                }
                    else if (yas>24 && yas<65) {
                        tutar = normaltutar;
                        System.out.println("Tutar: " + tutar);
                        if (yoltip == 2) {
                            ciftyonindirimi = tutar * 0.20;
                            toplamtutar = (tutar-ciftyonindirimi)* 2;
                            System.out.println("Çift yön tutar: " + toplamtutar);
                        }
                }
                    else if (yas>=65) {
                    yasindirimi = normaltutar * 0.30;
                    tutar = normaltutar - yasindirimi;
                    System.out.println("Tutar: " + tutar);
                    if (yoltip == 2) {
                        ciftyonindirimi = tutar * 0.20;
                        toplamtutar = (tutar-ciftyonindirimi)* 2;
                        System.out.println("Çift yön tutar: " + toplamtutar);
                    }
                }
        }else {
                System.out.println("Hatalı veri girdiniz.");
            }
        }else {
            System.out.println("Hatalı veri girdiniz.");
        }

    }
}