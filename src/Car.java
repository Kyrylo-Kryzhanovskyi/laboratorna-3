import java.util.HashMap;
import java.util.Map;

abstract class Car {
    private final String type; // Тип автомобіля - легковий, вантажний і тд.
    private String brand; // Марка автомобіля - BMW, Audi, Honda і тд.
    private String color; // Колір автомобіля - чорний, білий і тд.

    private int speed; // Швидкість
    private final String engine; // Тип двигуна - дизельний, бензиновий, електро
    private final float engineCapacity; // Об'єм двигуна
    private final String capacityUnit; // Одиниця виміру об'єму двигуна
    private float consumption; // Кількість спожитого палива на 100 км
    private final String consumptionUnit;// Одиниця виміру спожитого палива
    private float mileage; // Пробіг

    private final int maxLoadCapacity; //Максимальна вантажопідйомність
    private final int maxNumberOfPassengers; // Максимальна кількість пасажирів

    public static final int WEIGHTOFPASSENGER = 90;
    private int currentWorkload;
    private int currentPassengers;
    Map<String, Integer> Item = new HashMap<>();
    public Car(String type, String brand, String color, int speed, String engine, float engineCapacity, String capacityUnit, float consumption, String consumptionUnit, float mileage, int maxLoadCapacity, int maxNumberOfPassengers) {
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.engine = engine;
        this.engineCapacity = engineCapacity;
        this.capacityUnit = capacityUnit;
        this.consumption = consumption;
        this.consumptionUnit = consumptionUnit;
        this.mileage = mileage;
        this.maxLoadCapacity = maxLoadCapacity;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    @Override
    public String toString() {
        return "Car Information:\n" +
                "Type: " + type + "\n" +
                "Brand: " + brand + "\n" +
                "Color: " + color + "\n" +
                "Speed: " + speed + " km/h\n" +
                "Engine Type: " + engine + "\n" +
                "Engine Capacity: " + (engineCapacity > 0 ? engineCapacity + " " + capacityUnit : "n/a") + "\n" +
                "Fuel Consumption: " + consumption + " " + consumptionUnit + "\n" +
                "Mileage: " + mileage + " km\n" +
                "Max Load Capacity: " + maxLoadCapacity + " kg\n" +
                "Max Number of Passengers: " + maxNumberOfPassengers + "\n" +
                "Current Workload: " + currentWorkload + "\n" +
                "Current Passengers: " + currentPassengers + "\n" +
                "Trunk:"  +  Item + "\n";
    }
    public boolean addNewPassenger(){
        if(this.currentWorkload+ WEIGHTOFPASSENGER <getMaxLoadCapacity() && currentPassengers+1<getMaxNumberOfPassengers()){
            this.currentWorkload += WEIGHTOFPASSENGER;
            currentPassengers++;
            return true;
        }
        return false;
    }
    public boolean removePassenger(){
        if (this.currentPassengers>0){
            this.currentPassengers--;
            this.currentWorkload -= WEIGHTOFPASSENGER;
            return true;
        }
        return false;
    }
    public boolean addItemInTrunk(String nameItem, int weightItem){
        if(this.currentWorkload+weightItem<getMaxLoadCapacity() )
        {
            this.currentWorkload += weightItem;
            Item.put(nameItem, weightItem);
            return true;
        }
        return false;
    }
    public  boolean removeItemInTrunk( String nameItem){
        if(this.currentWorkload > 0 && Item.containsKey(nameItem)){
            this.currentWorkload -= Item.get(nameItem);
            Item.remove(nameItem);
            return true;
        }
        return false;
    }
    public float getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }


    private String getConsumptionUnit() {
        return consumptionUnit;
    }

    private String getCapacityUnit() {
        return capacityUnit;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }


    public int getSpeed() {
        return speed;
    }

    public String getEngine() {
        return engine;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public float getConsumption() {
        return consumption;
    }

    public float getMileage() {
        return mileage;
    }
}
