package DörtveBeşinKatlarınıBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int num = scanner.nextInt();

        for (int i=1; i<=num; i*=4){
            System.out.println("4'ün katları için Sonuç: " + i);
        }
        System.out.println("---------------------------------");
        for (int j=1; j<=num; j*=5){

                System.out.println("5'in katları için Sonuç: " + j);
          }

    }
}