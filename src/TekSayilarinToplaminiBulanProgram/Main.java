package TekSayilarinToplaminiBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num;
        int i;
        int sum=0;

        do {
            System.out.println("Sayı giriniz: ");
            num = scanner.nextInt();
            if (num % 4 == 0) {
                sum += num;
            }
        } while (num % 2 == 0);
                System.out.println("Toplam sonuç: " + sum);
    }
}