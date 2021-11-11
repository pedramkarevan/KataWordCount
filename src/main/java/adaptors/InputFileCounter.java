package adaptors;

import wordcount.services.interfaces.InputRead;
import wordcount.services.interfaces.StopWord;
import wordcount.services.interfaces.StringValidation;
import java.io.IOException;


public class InputFileCounter implements WordCount {
    public static final String SRC_USER_INPUT_MY_TEXT_TXT = "src/main/resources/mytext.txt";
    public final String SRC_STOP_WORDS_TXT = "src/main/resources/stopwords.txt";
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
        if (stringValidation.isStringValid(userInput))
            return wordHandler(userInput);
        throw new IllegalArgumentException("File input string is not valid!");


    }

    private int wordHandler(String userInput) throws IOException {
        String stopWords = inputRead.inputFileRead(SRC_STOP_WORDS_TXT);
        String mapString = stopWord.stopWordMapper(userInput, stopWords);
        return new Count().getUserInputCount(mapString);
    }

    public String getFileScannerInput() throws IOException {
        String userInput = inputRead.inputFileRead(SRC_USER_INPUT_MY_TEXT_TXT);
        if (userInput == null || userInput.isEmpty())
            userInput = inputRead.read();
        return userInput;
    }
}
