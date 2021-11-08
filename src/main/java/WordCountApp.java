
import adaptors.StopWordCounter;
import wordcount.services.impls.InputScanner;
import wordcount.services.impls.StringValidationImpl;
import wordcount.services.impls.stopWordImpl;
import wordcount.services.interfaces.InputRead;
import wordcount.services.interfaces.StopWord;
import wordcount.services.interfaces.StringValidation;

public class WordCountApp {


    public static void main(String[] arg) {
        InputRead inputRead = new InputScanner();
        StopWord stopWord= new stopWordImpl();
        StringValidation stringValidation=new StringValidationImpl();
        System.out.printf("Number of words :"+new StopWordCounter(inputRead,stopWord,stringValidation).wordCounter());

    }




}
