public class Car {
   private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println(this.getClass().getSimpleName() + " engine has started");
    }

    public void drive(){
        runEngine();

    }

    protected void runEngine() {
        System.out.println("Engine run.");
        System.out.println("Driving a " + this.getClass().getSimpleName() );
    }
}
