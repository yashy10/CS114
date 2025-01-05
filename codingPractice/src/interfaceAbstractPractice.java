interface Vehicle {
    public abstract void start();
    public abstract void stop();
    public abstract void honk();
}
interface Maintainance{
    public abstract void service();
    public abstract void repair();
}

abstract class AbstractVehicle implements Vehicle, Maintainance{
    public void fuelUp(){
        System.out.println("Filling up the Vehicle");
    }

}
class Car extends AbstractVehicle {
    public void start() {
        System.out.println("The car starts with a key.");
    }

    public void stop() {
        System.out.println("The car stops when the brake is applied.");
    }

    public void honk() {
        System.out.println("The car honks: Beep! Beep!");
    }
    public void service(){
        System.out.println("The car needs service");
    }
    public void repair(){
        System.out.println("The car needs repair");
    }
}

class Bike extends AbstractVehicle {
    public void start() {
        System.out.println("The bike starts with a kick or button.");
    }

    public void stop() {
        System.out.println("The bike stops when the brake is applied.");
    }

    public void honk() {
        System.out.println("The bike honks: Beep!");
    }
    public void service(){
        System.out.println("The bike needs service");
    }
    public void repair(){
        System.out.println("The bike needs repair");
    }
}
public class interfaceAbstractPractice {
    public static void main(String[] args) {
        AbstractVehicle car = new Car();
        car.fuelUp();
        car.start();
        car.stop();
        car.honk();
        car.repair();
        car.service();

        AbstractVehicle bike = new Bike();
        bike.fuelUp();
        bike.start();
        bike.stop();
        bike.honk();
        bike.repair();
        bike.service();
    }
}
