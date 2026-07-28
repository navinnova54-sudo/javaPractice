package Day11;

abstract class VehicleBase {
    abstract void start();
}

class BikeVehicle extends VehicleBase {

    void start() {
        System.out.println("Bike Started");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        VehicleBase v = new BikeVehicle();
        v.start();
    }
}
