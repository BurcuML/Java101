package ArmstrongSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = input.nextInt();
        int counter=0;
        int temp = sayi;
        int result;
        int armst;
        int total=0;

        while (temp!=0){
            temp/=10;
            counter++;
        }

        temp=sayi;

        while (temp!=0){
            result = temp%10;
            armst=1;
            for (int i=1; i<=counter; i++){
                armst*=result;
            }
            total+=armst;
            temp/=10;
        }
        if (total == sayi) {
            System.out.println(sayi + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(sayi + " sayısı bir Armstrong sayısı değildir.");
        }

        System.out.println("Basamak Sayısı: " + counter);
        System.out.println("--------------------------- ");
        System.out.println("Toplam: " + total);

    }
}