package wordcount.services.impls;

import wordcount.services.interfaces.InputReadable;

import java.util.Scanner;
/**
 * Reading user input by Scanner
 */

public class InputScanner implements InputReadable {
    @Override
    public String read() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter text : ");
            String inputString = in.nextLine();
            return inputString;
        }
    }
}
