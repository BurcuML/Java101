package HarmonikSeri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n,total=0, harmonik;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        n = scanner.nextInt();

        for (int i=1; i<=n; i++){
            total+= (double) 1 /i;
        }
        System.out.println("Harmonik seri: " + total);
    }
}