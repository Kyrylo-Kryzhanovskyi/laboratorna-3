import java.time.LocalDate;

public abstract class Car {
    protected String brand;
    protected String model;
    protected int yearOfRelease;
    protected String color;
    protected float engineVolume;

    Car(String brand, String model, int yearOfRelease, String color, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public abstract String getInfo();
    public abstract String checkStatus();
    public String getBrand(){
        return brand;
    }
    public boolean setBrand(String brand){
        this.brand = brand;
        return true;
    }
    public String getModel(){
        return model;
    }
    public boolean setModel(String model){
        this.model = model;
        return true;
    }
    public int getYearOfRelease(){
        return yearOfRelease;
    }
    public boolean setYearOfRelease(int yearOfRelease){
        if(yearOfRelease > 1000 && yearOfRelease <= LocalDate.now().getYear()){
            this.yearOfRelease = yearOfRelease;
            return true;
        }
        return false;
    }
    public String getColor(){
        return color;
    }
    public boolean setColor(String color){
        this.color = color;
        return true;
    }
    public float getEngineVolume(){
        return engineVolume;
    }
    public boolean setEngineVolume(float engineVolume){
        if(engineVolume >= 0){
            this.engineVolume = engineVolume;
            return true;
        }
        return false;
    }
}
