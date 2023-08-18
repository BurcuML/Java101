package GirilenSayiyaKadarOlanCiftSayilariBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int num = scanner.nextInt();
        int sum=0;
        int ort;
        int j=0;
        for (int i=1; i<=num; i++){
            if(i%4==0 && i%3==0){
                sum+=i;
                j++;
                ort=sum/j;
                System.out.println("Sonuç: " + ort);
            }
        }
    }
}