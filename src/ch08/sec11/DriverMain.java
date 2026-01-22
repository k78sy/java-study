package ch08.sec11;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //Vehicle들도 객체화;
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        driver.drive(bus);
        driver.drive(taxi);
    }
}
