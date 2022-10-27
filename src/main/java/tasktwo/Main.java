package tasktwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;

        do {
            System.out.println("Ange ditt namn: ");
            username = scanner.nextLine();
            System.out.println(username);
        } while (username.isEmpty());

        username = username.toUpperCase();

        switch (username.charAt(0)) {
            case 'Ö':
                System.out.println("Namnet börjar på bokstaven Ö och det är den sista bokstaven i alfabetet!");
                break;

            default:
                System.out.println("Namnet börjar på bokstaven " + username.charAt(0) + "!");


        }

    }
}