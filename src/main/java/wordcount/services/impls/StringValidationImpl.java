package wordcount.services.impls;

import wordcount.services.interfaces.StringValidation;

public class StringValidationImpl implements StringValidation {

    @Override
    public boolean isStringValid(String userInput) {
        return userInput.matches("[a-z A-Z]+\\.?+");
    }
}
