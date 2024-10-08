public class Truck  extends Car{
    private int loadCapacity;
    private String loadType;
    private int NumberOfAxes;
    Truck(String brand, String model, int yearOfRelease, String color, float engineVolume, int loadCapacity, String loadType, int NumberOfAxes) {
        super(brand, model, yearOfRelease, color, engineVolume);
        this.loadType = loadType;
        this.NumberOfAxes = NumberOfAxes;
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public boolean setLoadCapacity(int loadCapacity) {
        if (loadCapacity >= 0){
            this.loadCapacity = loadCapacity;
            return true;
        }
        return false;
    }

    public String getLoadType() {
        return loadType;
    }

    public boolean setLoadType(String loadType) {
        this.loadType = loadType;
        return true;
    }

    public int getNumberOfAxes() {
        return NumberOfAxes;
    }

    public boolean setNumberOfAxes(int numberOfAxes) {
        if (numberOfAxes > 0){
            this.NumberOfAxes = numberOfAxes;
            return true;
        }
        return false;
    }

    @Override
    public String getInfo() {
        return "Truck Info:\n" +
                "Brand: " + getBrand() + "\n" +
                "Model: " + getModel() + "\n" +
                "Year of Release: " + getYearOfRelease() + "\n" +
                "Color: " + getColor() + "\n" +
                "Engine Volume: " + getEngineVolume() + "L\n";
    }

    @Override
    public String checkStatus() {
        return "Truck Status:\n" +
               "Load Capacity: " + getLoadCapacity() + " kg\n" +
                "Load Type: " + getLoadType() + "\n" +
                "Number of Axes: " + getNumberOfAxes();
    }
}
