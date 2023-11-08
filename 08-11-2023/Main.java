public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar(100, 100);
        RaceMotorcycle raceMotorcycle = new RaceMotorcycle(100, 100);
        Car car = new Car(100, 100);

        sportCar.drive(10);
        System.out.println(sportCar.getFuel());
        raceMotorcycle.drive(10);
        System.out.println(raceMotorcycle.getFuel());
        car.drive(10);
        System.out.println(car.getFuel());
    }
}