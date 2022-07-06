package ManavKasa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

     double armut = 2.14, elma = 3.67, domates  = 1.11, muz = 0.95, patlican  = 5.00;
     double amiktar, emiktar, dmiktar, mmiktar, pmiktar;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        amiktar= input.nextDouble() * armut;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Elma Kaç Kilo ? :");
        emiktar= input1.nextDouble() * elma;

        Scanner input2 = new Scanner(System.in);
        System.out.println("Domates Kaç Kilo ? :");
        dmiktar= input2.nextDouble() * domates;

        Scanner input3 = new Scanner(System.in);
        System.out.println("Muz Kaç Kilo ? :");
        mmiktar= input3.nextDouble() * muz;

        Scanner input4 = new Scanner(System.in);
        System.out.println("Patlıcan Kaç Kilo ? :");
        pmiktar= input4.nextDouble() * patlican;

        double toplam = amiktar + emiktar + dmiktar + mmiktar + pmiktar;
        System.out.println("Toplam miktar: " + toplam);
    }
}
