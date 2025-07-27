package exceptions;

import java.io.IOException;

public class MyWriteException extends IOException {
    public MyWriteException(IOException e) {
    }
}
