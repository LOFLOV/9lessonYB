package exceptions;

public class MyArrayDataException extends NumberFormatException {
    int n;
    int d;

    public MyArrayDataException(int i, int j) {
        n = i;
        d = j;

    }

    @Override
    public String getMessage() {
        return "Не удалось сконвертировать элемент массива с индексом  "   + n + " " + d ;
    }
}
