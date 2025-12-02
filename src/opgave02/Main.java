package opgave02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        File numbersFile = new File("resources/numbers.txt");
        try {
            scanner = new Scanner(numbersFile);
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        while (scanner.hasNext()) {
            int tal = scanner.nextInt();
            System.out.println(tal * 2);
        }
        scanner.close();
    }
}
