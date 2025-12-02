package opgave05;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File userNumbers = new File("resources/userNumbers.txt");
        if (userNumbers.exists()) {
            System.out.println("File allready exists");
            System.exit(1);
        }

        try {
            userNumbers.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return;
        }

        PrintWriter writer;
        try {
            writer = new PrintWriter(userNumbers);
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
            return;
        }
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter 5 integers");
            for (int index = 0; index < 5; index++) {
                try {
                    int tal = scanner.nextInt();

                    if (tal < 0) {
                        System.out.println("The integer has to be positiv");
                        index--;
                    }else {
                    writer.println(tal);
                    }
                } catch (InputMismatchException exception) {
                    System.out.println("Enter an integer");
                    scanner.next();
                    index--;
                }
            }
            scanner.close();
            writer.print(-1);
            writer.close();
        }
    }

}

