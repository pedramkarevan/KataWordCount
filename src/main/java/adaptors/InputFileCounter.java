package adaptors;

import wordcount.services.interfaces.InputRead;
import wordcount.services.interfaces.StopWord;
import wordcount.services.interfaces.StringValidation;
import java.io.FileNotFoundException;
import java.io.IOException;


public class InputFileCounter implements WordCount {
    private InputRead inputRead;
    private StopWord stopWord;
    private StringValidation stringValidation;

    public InputFileCounter(InputRead inputRead, StopWord stopWord, StringValidation stringValidation) {
        this.inputRead = inputRead;
        this.stopWord = stopWord;
        this.stringValidation = stringValidation;
    }

    @Override
    public int wordCounter() throws IOException {
        String userInput = getFileScannerInput();
        if (stringValidation.isStringValid(userInput)) {
            String stopWords = inputRead.inputFileRead("src/main/resources/stopwords.txt");
            String mapString = stopWord.stopWordMapper(userInput, stopWords);
            return new Count().getUserInputCount(mapString);
        }
        throw new IllegalArgumentException("File Input String is not valid!");


    }

    private String getFileScannerInput() throws IOException {
        String userInput =inputRead.inputFileRead("src/main/resources/mytext.txt");
            if (userInput == null || userInput.isEmpty())
                userInput = inputRead.read();
            return userInput;
        }
    }
