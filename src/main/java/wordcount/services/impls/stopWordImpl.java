package wordcount.services.impls;
import wordcount.services.interfaces.StopWord;
import java.util.ArrayList;
import java.util.Arrays;


public class stopWordImpl implements StopWord {
    @Override
    public String stopWordMapper(String userInput, String stopWord) {
        userInput = userInput.toUpperCase();
        stopWord = stopWord.toUpperCase();

        String[] userInputs = getSplit(userInput);
        String[] stops = getSplit(stopWord);

        return  getMappedString(userInputs, stops);
    }


    private String getMappedString(String[] userInputs, String[] stops) {
        ArrayList<String> stopWords = new ArrayList<String>(Arrays.asList(stops));
        String new_str = "";
        for (String words : userInputs) {
            if (!stopWords.contains(words)) {
                new_str += words + " ";
            }
        }
        return new_str;
    }

    private String[] getSplit(String stopWord) {
        return stopWord.split("\\s");
    }


}
