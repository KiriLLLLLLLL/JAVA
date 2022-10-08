package HW3;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super("Массив содержит не числовой элемент" + message);
    }
}
