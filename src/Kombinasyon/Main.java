package Kombinasyon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = 1;
        int r=1;
        int s=1;
        int d;
        double C;

        System.out.println("n'i giriniz:");
        int num1= scanner.nextInt();
        for (int i=num1; i>0; i--){
            n*=i;
        }
        System.out.println("r'yi giriniz:");
        int num2= scanner.nextInt();
        for (int j=num2; j>0; j--){
            r*=j;
        }
        d=num1-num2;
        for (int k=d; k>0; k--){
            s*=k;
        }

        C=(double)n/(r*s);
        System.out.println("Kombinasyon: " + C);
    }
}