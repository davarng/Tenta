package taskthree;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int menuChoice;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        do{
            Person person = new Person();
            System.out.println("Ange personens förnamn: ");
            person.setFirstName(scanner.nextLine());
            System.out.println("Ange personens efternamn: ");
            person.setLastName(scanner.nextLine());
            System.out.println("Ange personens favoritfilm: ");
            person.setFavouriteMovie(scanner.nextLine());

            people.add(person);

            System.out.println("Ange 1 om du vill Läsa upp dina Objekt");
            try {
                menuChoice = Integer.parseInt(scanner.nextLine());
                System.out.println("---------------------------------");
            }catch (Exception e) {
                System.out.println("---------------------------------");
                menuChoice = 2;
            }

        }while (menuChoice != 1);

        for(Person person : people) {
            System.out.println("Person nummer " + (people.indexOf(person)+1));
            System.out.println("Förnamn:  " + person.getFirstName());
            System.out.println("Efternamn: " + person.getLastName());
            System.out.println("Favoritfilm: " + person.getFavouriteMovie() + "\n---------------------------------");
        }

    }
}
