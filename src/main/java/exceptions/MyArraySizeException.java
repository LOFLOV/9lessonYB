package exceptions;

public class MyArraySizeException extends Exception{

    @Override
    public String getMessage() {
        return "Catch MyArraySizeException";
    }
}
