package VucutKitleİndeksi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz:");
        double kilo = input.nextInt();
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz:");
        double boy = input.nextInt();
        double sonuc= kilo/boy*boy;
        System.out.println("Vücut kitle indeksiniz:" + sonuc);
    }
}
