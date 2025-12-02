package opgave03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        ArrayList<Integer> numbers = new ArrayList<>();
        File numbersFile = new File("resources/numbers.txt");
        int tal;

        try {
            scanner = new Scanner(numbersFile);
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        while (scanner.hasNext()) {
            tal = scanner.nextInt();
            numbers.add(tal);
        }
        for (int index = numbers.size()-1; index > 0; index--) {
            System.out.println(numbers.get(index-1));
        }
    }
}
