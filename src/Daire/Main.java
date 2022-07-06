package Daire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Yarıçap ve merkez açısını giriniz:");
        double a =input.nextDouble();
        double r = input.nextDouble();
        double alan= pi * r * r;
        double cevre = 2* pi * r;
        double dairedilimi=(pi*r*r*a)/360;
        System.out.println("Alan:" + alan);
        System.out.println("Çevre" + cevre);
        System.out.println("Daire dilimi alanı:" + dairedilimi);
    }
}
