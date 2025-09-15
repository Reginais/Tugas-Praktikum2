package CAR;

public class Car {
    // Attribute 
    public String color;
    public String noPlate;
    public double width;
    public double height;
    public String brand;
    public boolean headLampOn; 

    // Konstruktor
    public Car() {
        this.color = "Hitam";
        this.noPlate = "B 222 RRR";
        this.width = 2.0;  
        this.height = 2.0; 
        this.brand = "Honda";
        this.headLampOn = false;
    }
   
    // Method untuk startEngine
    public void startEngine() {
        System.out.println("Mesin mobil " + noPlate + " menyala");
    }

    // Method untuk Throttle
    public void Throttle() {
        System.out.println("Mobil " + noPlate + " melaju dengan cepat");
    }

    // Method untuk Brake
    public void Brake() {
        System.out.println("Mobil " + noPlate+ " mengerem...");
    }

    // Method untuk turnOnHeadLamp
    public void turnOnHeadLamp() {
        headLampOn = true;
        System.out.println("Lampu depan mobil " + brand + " " + color + " menyala");
    }

    // Method untuk turnOffHeadLamp
    public void turnOffHeadLamp() {
        headLampOn = false;
        System.out.println("Lampu depan mobil " + brand + " " + color + " mati");
    }
}
