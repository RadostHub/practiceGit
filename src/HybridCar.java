public class HybridCar extends Car{
    private  double avgKmPerDrive;
    private int batterySize;
    private  int cylinders;
    public HybridCar(String description, double avgKmPerDrive, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerDrive = avgKmPerDrive;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine() {
        super.startEngine();

    }
    @Override
    public void drive() {
        runEngine();
        System.out.println("Driving my Hybrid Car with " + this.cylinders + " cylinders");
    }


}
