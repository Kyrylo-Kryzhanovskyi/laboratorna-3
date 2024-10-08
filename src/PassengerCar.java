public class PassengerCar extends Car{
    private String vehicleType;
    private int numberOfPassengerSeats;
    private boolean haveAirConditioner = false;
    private boolean haveHeatedSeat = false;
    private boolean haveMultimedia = false;
    private boolean isElectric = false;
    private float chargeLevel = 0;
    private int  powerReserve = 0;
    PassengerCar(String brand, String model, int yearOfRelease, String color, float engineVolume, String vehicleType, int numberOfPassengerSeats) {
        super(brand, model, yearOfRelease, color, engineVolume);
        this.vehicleType = vehicleType;
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }
    PassengerCar(String brand, String model, int yearOfRelease, String color, float engineVolume, String vehicleType, int numberOfPassengerSeats,  float chargeLevel, int powerReserve) {
        this(brand, model, yearOfRelease, color, engineVolume, vehicleType, numberOfPassengerSeats);
        this.isElectric = true;
        this.chargeLevel = chargeLevel;
        this.powerReserve = powerReserve;
    }

    @Override
    public String getInfo() {
        return "Passenger Car Info:\n" +
                "Brand: " + getBrand() + "\n" +
                "Model: " + getModel() + "\n" +
                "Year of Release: " + getYearOfRelease() + "\n" +
                "Color: " + getColor() + "\n" +
                "Electric: " + (isElectric() ? "Yes" : "No") + "\n" +
                "Engine Volume: " +  getEngineVolume() + (isElectric() ? "kW\n" : "L\n") +
                (isElectric() ? "Charge Level: " + getChargeLevel() + "%\n" : "") +
                "Vehicle Type: " + getVehicleType() + "\n";
    }

    @Override
    public String checkStatus() {
        return "Passenger Car Status:\n" +
                "Number of Passenger Seats: " + getNumberOfPassengerSeats() + "\n" +
                "Air Conditioner: " + (isHaveAirConditioner() ? "Yes" : "No") + "\n" +
                "Heated Seats: " + (isHaveHeatedSeat() ? "Yes" : "No") + "\n" +
                "Multimedia: " + (isHaveMultimedia() ? "Yes" : "No") + "\n" +
                (isElectric() ? "Power Reserve: " + getPowerReserve()  + " km" : "");
    }

    public String getVehicleType() {
        return vehicleType;
    }
    public boolean setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return true;
    }
    public int getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }
    public boolean setNumberOfPassengerSeats(int numberOfPassengerSeats) {
        this.numberOfPassengerSeats = numberOfPassengerSeats;
        return true;
    }

    public boolean isHaveAirConditioner() {
        return haveAirConditioner;
    }
    public boolean addAirConditioner() {
        if(!isHaveAirConditioner()){
            this.haveAirConditioner = true;
            return true;
        }
        return false;
    }
    public boolean removeAirConditioner() {
        if(isHaveAirConditioner()){
            this.haveAirConditioner = false;
            return true;
        }
        return false;
    }

    public boolean isHaveHeatedSeat() {
        return haveHeatedSeat;
    }
    public boolean setHeatedSeat() {
        if(!isHaveHeatedSeat()){
            this.haveHeatedSeat = true;
            return true;
        }
        return false;
    }
    public boolean removeHeatedSeat() {
        if(isHaveHeatedSeat()){
            this.haveHeatedSeat = false;
            return true;
        }
        return false;
    }


    public boolean isHaveMultimedia() {
        return haveMultimedia;
    }

    public boolean addMultimedia() {
        if(!isHaveMultimedia()){
            this.haveMultimedia = true;
            return true;
        }
        return false;
    }
    public boolean removeMultimedia() {
        if(isHaveMultimedia()){
            this.haveMultimedia = false;
            return true;
        }
        return false;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public float getChargeLevel() {
        return chargeLevel;
    }

    public boolean setChargeLevel(float chargeLevel) {
        if(isElectric() && chargeLevel>=0 && chargeLevel<=100){
            this.chargeLevel = chargeLevel;
            return true;
        }
        return false;
    }

    public int getPowerReserve() {
        return powerReserve;
    }

    public boolean setPowerReserve(int powerReserve) {
        if(isElectric()){
            this.powerReserve = powerReserve;
            return true;
        }
        return false;
    }
}