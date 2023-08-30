package BasamakSayisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = input.nextInt();
        int total=0;
        int counter=0;
        int result;

        while (sayi!=0){
            result= sayi %10;
            total+=result;
            sayi/=10;
            counter++;
        }
        System.out.println("Basamak Sayısı: " + counter);
        System.out.println("Toplam: " + total);
    }
}