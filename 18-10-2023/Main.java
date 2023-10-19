import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Car> cars = new ArrayList<Car>();

        for(int i = 0; i < n; i++){
            cars.add(new Car(sc.next(), sc.next(), sc.nextInt()));
        }

        for(int i = 0; i < n; i++) {
            System.out.println(cars.get(i).getCarInfo());
        }
    }
}