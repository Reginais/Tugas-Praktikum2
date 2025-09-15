package CAR;

public class Car {
    public String color;
    public String noPlate;
    public double width;
    public double height;
    public String brand;
    public boolean headLampOn; 

    public Car() {
        this.color = "Hitam";
        this.noPlate = "B 222 RRR";
        this.width = 2.0;  
        this.height = 2.0; 
        this.brand = "Honda";
        this.headLampOn = false;
    }

    public Car(String color, String noPlate, double width, double height, String brand) {
        this.color = color;
        this.noPlate = noPlate;
        this.width = width;
        this.height = height;
        this.brand = brand;
        this.headLampOn = false;
    }
    
    public void startEngine() {
        System.out.println("Mesin mobil " + noPlate + " menyala");
    }

    public void Throttle() {
        System.out.println("Mobil " + noPlate + " melaju dengan cepat");
    }

    public void Brake() {
        System.out.println("Mobil " + noPlate+ " mengerem...");
    }

    // Method tambahan sesuai permintaan
    public void turnOnHeadLamp() {
        headLampOn = true;
        System.out.println("Lampu depan mobil " + brand + " " + color + " menyala");
    }

    public void turnOffHeadLamp() {
        headLampOn = false;
        System.out.println("Lampu depan mobil " + brand + " " + color + " mati");
    }
}
