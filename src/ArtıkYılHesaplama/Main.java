package ArtıkYılHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yılı giriniz: ");
        int year = scanner.nextInt();

        if(year%4==0 && year!=1700 && year!=1800 && year!=1900){
            System.out.println(year + " bir artık yıldır!");
        }else {
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}