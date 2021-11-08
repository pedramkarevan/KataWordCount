package wordcount.services.impls;

import wordcount.services.interfaces.InputRead;

import java.util.Scanner;
/**
 * Reading user input by Scanner
 */

public class InputScanner implements InputRead {
    @Override
    public String read() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter text : ");
            String inputString = in.nextLine();
            return inputString;

    }
}
