package adaptors;

import wordcount.services.interfaces.InputRead;
import wordcount.services.interfaces.StringValidation;
import wordcount.services.interfaces.UniqueWord;

import java.io.IOException;

public class UniqueWordCounter implements WordCount {
    private InputFileCounter inputFileCounter;
    private StringValidation stringValidation;
    private UniqueWord uniqueWord;
    private InputRead inputRead;

    public UniqueWordCounter(InputFileCounter inputFileCounter, StringValidation stringValidation,
                             UniqueWord uniqueWord) {
        this.inputFileCounter = inputFileCounter;
        this.stringValidation = stringValidation;
        this.uniqueWord = uniqueWord;
    }

    @Override
    public int wordCounter() throws IOException {
        String userInput = inputFileCounter.getFileScannerInput();
        if (stringValidation.isStringValid(userInput)) {
            String uniqueString = uniqueWord.uniqueWordMapper(userInput);
            return new Count().getUserInputCount(uniqueString);
        }
        throw new IllegalArgumentException("File input string is not valid!");
    }
}
