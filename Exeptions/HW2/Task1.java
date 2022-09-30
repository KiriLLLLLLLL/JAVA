package HW2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        boolean a = true;

        while (a) {
            try {
                Float b = inputFloatNumber();
                System.out.println(b);
                a = false;

            } catch (InputMismatchException e) {
                System.out.println("Это не число с плавающей точкой!!! Повторите попытку ввода:");

            }

        }

    }

    public static Float inputFloatNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число с плавающей точкой: ");
        Float floatn = in.nextFloat();
        in.close();
        return floatn;
    }
}