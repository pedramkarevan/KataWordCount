package wordcount.services.impls;

import wordcount.services.interfaces.InputRead;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Reading user input by Scanner
 */

public class InputScanner implements InputRead {
    @Override
    public String read() {
           try( Scanner in = new Scanner(System.in);) {
               System.out.println("Enter text : ");
               String inputString = in.nextLine();
               return inputString;
           }
    }

    @Override
    public String inputFileRead(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append(" "));
        }
		catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
}
