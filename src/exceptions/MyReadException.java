package exceptions;

import java.io.IOException;

public class MyReadException extends IOException {
    public MyReadException(IOException e) {
    }
}
