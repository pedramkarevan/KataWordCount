import wordcount.services.impls.InputScanner;
import wordcount.services.impls.StringValidationImpl;
import wordcount.services.interfaces.InputRead;
import wordcount.services.interfaces.StringValidation;

public class WordCountApp {


    public static void main(String[] arg) {
        StringValidation stringValidation = new StringValidationImpl();
        InputRead inputRead = new InputScanner();
        String userInput = inputRead.read();
        mainWordCounter(stringValidation, userInput);
    }

    private static void mainWordCounter(StringValidation stringValidation, String userInput) {
        if (stringValidation.isStringValid(userInput))
           System.out.println("Number of words :"+ new Count().getUserInputCount(userInput));
        else
            throw new IllegalArgumentException("Input String is not valid!");
    }


}
