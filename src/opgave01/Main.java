package opgave01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Hvilket nr. primtal skal vises?: ");
                    int n = scanner.nextInt();
                    System.out.println("Primtal nr. " + n + " er "
                            + primes[n - 1] + "\n");
                } catch (InputMismatchException exception) {
                    System.out.println("Indtast et heltal");
                    scanner.nextLine();
                } catch (ArrayIndexOutOfBoundsException exception){
                    System.out.println("Indtast et tal mellem 1 og 10");
                }
            }
        }
    }
}
