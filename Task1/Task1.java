// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 

// Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    static int getScannerNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input int number : ");
        int num = in.nextInt();

        return num;

    }

    static void writeNumbers() {
        try (FileWriter writer = new FileWriter("C:/JavaProjects/Task1/input.txt", false)) {

            int num1 = getScannerNumber();
            int num2 = getScannerNumber();
            String number2 = "b " + num2 + "\n";
            String number1 = "a " + num1;

            writer.write(number2);
            writer.write(number1);
            writer.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void writeResult(double num) {
        try (FileWriter writer = new FileWriter("C:/JavaProjects/Task1/output.txt", false)) {
            String result = String.valueOf(num);
            writer.write(result);
            writer.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static String[] loadNumbers(String path) throws Exception {
        BufferedReader read = new BufferedReader(new FileReader(path));
        String str;
        String[] str2 = new String[2];
        int i = 0;
        while ((str = read.readLine()) != null) {
            String result = str.replaceAll("\\D+", "");
            System.out.println(result);
            str2[i] = result;
            i++;
        }
        return str2;
    }

    public Task1() {
    }

    public static void main(String[] args) throws Exception {
        writeNumbers();
        String[] numb = loadNumbers("C:/JavaProjects/Task1/input.txt");
        System.out.print(Arrays.toString(numb));
        int a = Integer.parseInt(numb[1]);
        int b = Integer.parseInt(numb[0]);
        double c = Math.pow(a, b);
        System.out.printf("%d ^ %d = %.0f", a, b, Math.pow(a, b));
        writeResult(c);
    }
}
