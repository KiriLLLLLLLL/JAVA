package HW1;

public class Task1 {
    public static void main(String[] args) {

    }

    // делить на ноль нельзя ArithmeticExeption: / by zero
    public static int first_method(int a) {
        int b = 0;
        return a / b;
    }

    // обращение к элементу массива за его пределами - IndexOutOfВoundsException
    public static int second_method(int a) {
        int[] arr = new int[a];
        int b = arr[arr.length + 1];
        return b;
    }

    // NullPointerException: Cannot invoke "String.length()" because "string" is
    // null
    public static int third_method() {
        String string = null;
        return string.length();
    }
}
