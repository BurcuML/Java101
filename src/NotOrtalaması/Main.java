package NotOrtalaması;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create the parameters
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Describe the Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        mat= input.nextInt();

        System.out.println("Fizik notunuz:");
        fizik= input.nextInt();

        System.out.println("Türkçe notunuz:");
        turkce= input.nextInt();

        System.out.println("Kimya notunuz:");
        kimya= input.nextInt();

        System.out.println("Tarih notunuz:");
        tarih= input.nextInt();

        System.out.println("Müzik notunuz");
        muzik= input.nextInt();

        int toplam= mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam/6.0;

        System.out.println(sonuc);

        boolean kosul1 = sonuc < 60;
        boolean kosul2 = sonuc > 60;

        String snc = kosul1 ? "Sınıfta Kaldı" : "Sınıfı Geçti";
        System.out.println(snc);

    }
}
