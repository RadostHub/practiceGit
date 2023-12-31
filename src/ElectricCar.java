public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();

    }
    @Override
    public void drive() {
        runEngine();
        System.out.println("Driving my Electric Car with " + this.batterySize + " battery size");
    }

}
