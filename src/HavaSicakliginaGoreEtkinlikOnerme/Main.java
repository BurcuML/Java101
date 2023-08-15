package HavaSicakliginaGoreEtkinlikOnerme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz: ");
        int temp= scanner.nextInt();

        if (temp<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temp>=5 && temp<15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (temp>=15 && temp<=25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}