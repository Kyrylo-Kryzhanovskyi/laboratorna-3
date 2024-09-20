

public class PassengerCar extends Car{
    public PassengerCar(String brand, String color,  int speed, String engine, float engineCapacity, float consumption, float mileage) {
        super("Passenger", brand, color, speed, engine, engineCapacity,"litres", consumption,"litres/100km",  mileage, 1200, 5);
    }

    public PassengerCar(String brand, String color,  int speed, String engine, float consumption, float mileage) {
        super("Passenger", brand, color,  speed, engine, 0, "n/a",consumption, "kWh/100km", mileage,1200,5);
    }


}
