
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class exportContact {
    // static String[] loadNumbers(String path) throws Exception {
    // BufferedReader read = new BufferedReader(new FileReader(path));
    // String str;
    // String[] str2 = new String[3];
    // int i = 0;
    // while ((str = read.readLine()) != null) {
    // String result = str.replaceAll("\\D+", "");
    // System.out.println(result);
    // str2[i] = result;
    // i++;
    // }
    // return str2;

    static void expContact(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\ ");
            System.out.println(Arrays.toString(words));
        }

        scanner.close();
    }

}
