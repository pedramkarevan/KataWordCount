package adaptors;


import wordcount.services.interfaces.InputRead;
import wordcount.services.interfaces.StopWord;
import wordcount.services.interfaces.StringValidation;

import java.io.IOException;


public class StopWordCounter implements WordCount {
    private InputRead inputRead;
    private StopWord stopWord;
    private StringValidation stringValidation;


    public StopWordCounter(InputRead inputRead, StopWord stopWord, StringValidation stringValidation) {
        this.inputRead = inputRead;
        this.stopWord = stopWord;
        this.stringValidation=stringValidation;
    }

    @Override
    public int wordCounter() throws IOException {
        String userInput = inputRead.read();
        if (stringValidation.isStringValid(userInput)) {
            return wordHandler(userInput);
        }
        throw new IllegalArgumentException("Input String is not valid!");
    }

    private int wordHandler(String userInput) throws IOException {
        String stopWords = inputRead.inputFileRead("src/main/resources/stopwords.txt");
        String mapString = stopWord.stopWordMapper(userInput, stopWords);
        return new Count().getUserInputCount(mapString);
    }
}
