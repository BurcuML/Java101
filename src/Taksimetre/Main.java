package Taksimetre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.println("Km giriniz:");
        int km = input.nextInt();
        double yol =10 + (km * 2.20);
        double mesafe = yol<20 ? yol=20 : yol;
        System.out.println(yol);
    }
}