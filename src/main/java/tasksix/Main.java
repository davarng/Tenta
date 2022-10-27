package tasksix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userPoints = 0;
        String userAnswer;

        System.out.println("Nämn en av rollerna som finns inom Scrum: ");
        userAnswer = scanner.nextLine().toLowerCase();
        if (userAnswer.equals("scrum master") || userAnswer.equals("utvecklingsteamet")
                ||userAnswer.equals("produktägaren")) {
            userPoints++;
        }

        System.out.println("Nämn en av cermonierna som finns inom Scrum: ");
        userAnswer = scanner.nextLine().toLowerCase();
        if (userAnswer.equals("sprint") || userAnswer.equals("sprintplanering")
                ||userAnswer.equals("daily scrum") ||userAnswer.equals("sprint review")
                ||userAnswer.equals("sprint retrospective")) {
            userPoints++;
        }

        System.out.println("Vad är rekommenderat max antal personer i ett team?: ");
        userAnswer = scanner.nextLine().toLowerCase();
        if (userAnswer.equals("9")) {
            userPoints++;
        }

        System.out.println("Scrum har ett dokument där ALL information om Scrum finns, vad heter dokumentet?: ");
        userAnswer = scanner.nextLine().toLowerCase();
        if (userAnswer.equals("the scrum guide")) {
            userPoints++;
        }

        System.out.println("Vem är den enda personen som får avbryta en sprint?: ");
        userAnswer = scanner.nextLine().toLowerCase();
        if (userAnswer.equals("produktägaren")) {
            userPoints++;
        }

        if(userPoints == 5) {
            System.out.println("\nGrattis! Du fick full pott! 5 Poäng.");
        }else if(userPoints < 3) {
            System.out.println("\nDu fick bara " + userPoints + " Poäng, läs på lite mer till nästa gång");
        }else {
            System.out.println("\nDu fick " + userPoints + " poäng. Bra jobbat.");
        }






    }
}
