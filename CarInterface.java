package tugaspertemuan2;

import CAR.Car;

public class CarInterface {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.startEngine();
        car1.Throttle();
        car1.Brake();
        car1.turnOnHeadLamp();
        car1.turnOffHeadLamp();
    }
}