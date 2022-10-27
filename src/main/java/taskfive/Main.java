package taskfive;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Car> cars = new ArrayList<>();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        while(choice != 1) {
            Car car = new Car();

            System.out.println("Ange bilens färg: ");
            car.setColor(scanner.nextLine());
            System.out.println("Ange bilens märke: ");
            car.setBrand(scanner.nextLine());
            System.out.println("Antal bilar skapade: " + Car.getNumberOfCars());

            cars.add(car);

            System.out.println("\nAnge 1 om du är färdig med att skapa bilar.");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                System.out.println("---------------------------------");
            }catch (Exception e) {
                choice = 2;
                System.out.println("---------------------------------");
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        Path path = Paths.get("src/main/resources/cars.json");

        mapper.writeValue(path.toFile(), cars);
        System.out.println("Bilarna är nu sparade i jsonfil");

    }
}
