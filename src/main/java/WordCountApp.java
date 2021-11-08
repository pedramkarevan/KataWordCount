
import adaptors.InputFileCounter;
import adaptors.UniqueWordCounter;
import wordcount.services.impls.InputScanner;
import wordcount.services.impls.StringValidationImpl;
import wordcount.services.impls.UniqueWordImpl;
import wordcount.services.impls.stopWordImpl;
import wordcount.services.interfaces.InputRead;
import wordcount.services.interfaces.StopWord;
import wordcount.services.interfaces.StringValidation;
import wordcount.services.interfaces.UniqueWord;

import java.io.IOException;

public class WordCountApp {


    public static void main(String[] arg) throws IOException {
        InputRead inputRead = new InputScanner();
        StopWord stopWord= new stopWordImpl();
        StringValidation stringValidation=new StringValidationImpl();
        InputFileCounter inputFileCounter =new InputFileCounter(inputRead,stopWord,stringValidation);
        UniqueWord uniqueWord =new UniqueWordImpl();

        System.out.printf("Number of words :"+inputFileCounter.wordCounter()
        +", unique:"+ new UniqueWordCounter(inputFileCounter,stringValidation,uniqueWord).wordCounter());

    }




}
