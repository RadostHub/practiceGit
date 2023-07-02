public class Main {
    int x = 5;
    public static void main(String[] args) {
        Car myElectricCar = new ElectricCar("2010 Tesla Japan made",300,201);
      runCar(myElectricCar);

        System.out.println("___________________________________");

        var aCar = new HybridCar("Hybrid 2 worls together",400,150,4 );
        runCar(aCar);


        byte arr[] = new byte []{2,3,4,5};
        for(final int i:getCharArray(arr))
            System.out.println(i + "");

        Shape shape = new Quadrilateral();
        Quadrilateral quadrilateral = new Quadrilateral();

       Triangle tri = (Triangle) shape; // throuw exception

        //Triangle tri1 = (Triangle) quadrilateral; doesnt compile
       shape = quadrilateral;


    }



    private static char[] getCharArray(byte[] arr) {
        char [] carr = new char[4];
        int i = 0;
        for(byte c : arr){
            carr[i] = (char) --c;
            i++;
        }
        return carr;
    }

    public static void runCar(Car car){
        car.startEngine();
        car.drive();
        var war = 3;
    }
}

class Shape {}
class Quadrilateral extends Shape{}

class Triangle extends Shape{}