package wordcount.services.impls;

import wordcount.services.interfaces.UniqueWord;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueWordImpl implements UniqueWord {
    @Override
    public String uniqueWordMapper(String userInput) {
        String[] words = userInput.split(" ");
        HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
        return uniqueWords.toString();
    }
}
