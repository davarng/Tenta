package taskfour;

import com.fasterxml.jackson.databind.ObjectMapper;
import taskthree.Person;

import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;


// vet ej om jag förstod rätt med att ändra direkt i jsonfilen? Jag skrev in allt manuellt där.
public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Path path = Paths.get("src/main/resources/people.json");

        List<Person> personList = List.of(mapper.readValue(path.toFile(), Person[].class));

        for(Person person : personList) {
            System.out.println("Förnamn: " + person.getFirstName());
            System.out.println("Efternamn: " + person.getLastName());
            System.out.println("Favoritfilm " + person.getFavouriteMovie());
            System.out.println("-----------------------------");
        }







    }
}
