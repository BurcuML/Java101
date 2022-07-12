package Classes;

public class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit=200;

    void increaseSpeed(int increment){

        int a= 5;
        if((speed + increment) < speedLimit){
            speed += increment;
        }
    }

    void decreaseSpeed(int decrease){
        if(speed > 0){
            speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.print("Hızınız: " + speed + " " + "Renk: " + color);
    }
}
