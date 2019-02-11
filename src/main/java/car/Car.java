package car;

public class Car {

    private int speed;
    public void increaseSpeed () throws CarCrashedException {
        speed +=70;
        if (speed >200){

            throw new CarCrashedException("Car Crash");
        }
    }

    public static void main(String[] args) {
        Car a = new Car();

        try {
            a.increaseSpeed();
            a.increaseSpeed();
            a.increaseSpeed();
        } catch (CarCrashedException e) {
            e.printStackTrace();
        }

    }
}
