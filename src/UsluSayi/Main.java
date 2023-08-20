package UsluSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, u;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        n = scanner.nextInt();
        System.out.println("Üs giriniz:");
        u = scanner.nextInt();
        int total=1;
        int i=1;

        for (i=1; i<=u; i++){
            total*=n;
        }
        System.out.println("Sonuç: " + total);
    }
}