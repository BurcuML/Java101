package DikUcgendeHipotenus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Kenarları giriniz:");
        int kenar1=input.nextInt();
        int kenar2=input.nextInt();
        int kenar3 = input.nextInt();

        int u= (kenar1 + kenar2 + kenar3)/2;
        int cevre= 2*u;
        int alan = u* (u-kenar1)*(u-kenar2)*(u-kenar3);

        System.out.println("Alan:"+ alan + "Çevre:" + cevre);

    }
}
