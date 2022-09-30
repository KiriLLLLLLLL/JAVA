package HW2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите текст: ");
            String string = input.nextLine();
            string = string.trim();
            if (string.isEmpty())
                throw new IllegalArgumentException("Только не пустая строка!!!!!");
            else
                System.out.println(string);
        }
    }
}
