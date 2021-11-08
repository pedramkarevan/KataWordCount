package adaptors;

public class Count {

    public int getUserInputCount(String userInput) {
        if (userInput == null || userInput.isEmpty()) { return 0; }

        return userInput.split("\\s+").length;
    }
}
