package HW3;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Неверный размер массива, не 4х4!");
    }
}
