package Classes;

public class Main {
    public static void main(String[] args){

        Car audi = new Car();
        audi.speed=150;
        audi.model = " Audi Q3";
        audi.color = "Kırmızı";
        audi.increaseSpeed(30);
        audi.printSpeed();

    }
}
