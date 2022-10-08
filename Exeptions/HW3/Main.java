package HW3;

public class Main {
    public static void main(String[] args) {
        int result = 0;

        String[][] array = { { "1", "2", "3", "4" }, { "5", "6", "7", "8" } };
        String[][] error_length_array = { { "1", "2", "3", "4", "5" }, { "6", "7", "8", "9" } };
        String[][] error_data_array = { { "1", "2", "3", "4", }, { "5", "6", "ups", "8" } };

        try {
            result = 0;
            result = testingArr(array);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("1. Результат проверки валидного массива: ");
            System.out.println("Сумма элементов массива равна: " + String.valueOf(result));
            System.out.println();
        }

        System.out.println("2. Результат проверки матрицы на квадратность: ");
        try {
            result = 0;
            result = testingArr(error_length_array);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("3. Результат проверки массива с нечисловыми элементами: ");
        try {
            result = 0;
            result = testingArr(error_data_array);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int testingArr(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;
        int value = 0;
        int row = 0;
        int cell = 0;

        if (array.length != 2 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 1; i < 3; i++) {
            row = i;
            for (int c = 1; c < 5; c++) {
                cell = c;
                try {
                    value = Integer.parseInt(array[i - 1][c - 1]);
                    sum += value;
                } catch (IllegalArgumentException e) {
                    String message = "в " + String.valueOf(row) + " ряду, " + String.valueOf(cell) + " ячейке";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return sum;
    }
}
