import exceptions.MyArrayDataException;
import exceptions.MyArraySizeException;


public class MainApp {
    public static void main(String[] args) {

        String[][] arrayOfStr = new String[][]{{"0", "1", "0", "1"}, {"1", "2", "1", "1"}, {"1", "2", "2", "1"}, {"1", "0", "2", "1"}};
//        System.out.println(arrayOfStr.length + " длина масива");
//        String[][] testArray5x5 = new String[5][5];

        try {
            try {
                method(arrayOfStr);
            } catch (MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
            System.out.println("Размер массива превышен!");
        }
    }


    public static void method(String[][] arrayOfStr) throws MyArrayDataException, MyArraySizeException {

        if (arrayOfStr.length != 4) {
            throw new MyArraySizeException();
        }


        int[][] intArray = new int[arrayOfStr.length][arrayOfStr.length];
        int sum = 0;
        for (int i = 0; i < arrayOfStr.length; i++) {
            for (int j = 0; j < arrayOfStr.length; j++) {
                intArray[i][j] = 0;
                try {
                    intArray[i][j] = Integer.parseInt(arrayOfStr[i][j]);
                    System.out.print(arrayOfStr[i][j] + " ");
                    sum += intArray[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
}
