package opgave04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File oddNumbers = new File("resources/oddNumbers.txt");
        if (oddNumbers.exists()){
            System.out.println("File allready exists");
            System.exit(1);
        }

        try {
            oddNumbers.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return;
        }

        PrintWriter writer;
        try {
            writer = new PrintWriter(oddNumbers);
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
            return;
        }

        for (int index = 0; index < 100; index++) {
            if (index % 2 != 0){
                writer.println(index);
            }
        }
        writer.close();
    }
}
