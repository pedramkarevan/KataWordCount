import wordcount.services.impls.InputScanner;
import wordcount.services.impls.StringValidationImpl;
import wordcount.services.interfaces.InputReadable;
import wordcount.services.interfaces.StringValidation;

public class WordCountApp {


    public static void main(String[] arg) {
        StringValidation stringValidation = new StringValidationImpl();
        InputReadable inputReadable = new InputScanner();
        String userInput = inputReadable.read();

        if (stringValidation.isStringValid(userInput))
           System.out.println("Number of words :"+ new Count().getUserInputCount(userInput));
        else
            throw new IllegalArgumentException("Input String is not valid!");
    }


}
