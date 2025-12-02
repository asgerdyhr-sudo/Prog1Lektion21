package opgave06;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        File file = new File("resources/opgave06/data.txt");
        try {
            int max = maximum(file);
            System.out.println("the biggest number is: " + max);
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }
    }

    public static int maximum(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int biggestNumber = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            try {
                int currentNumber = scanner.nextInt();
                if (currentNumber > biggestNumber) {
                    biggestNumber = currentNumber;
                }
            } catch (InputMismatchException exception) {
                scanner.next();
            }
        }
        scanner.close();
        return biggestNumber;
    }
}



