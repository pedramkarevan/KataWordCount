package wordcount.services.interfaces;


import java.io.IOException;

public interface InputRead {
    String read();
    String inputFileRead(String filePath) throws IOException;
}
