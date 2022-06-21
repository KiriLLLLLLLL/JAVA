
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class exportContact {
    static String[] loadNumbers(String path) throws Exception {
        BufferedReader read = new BufferedReader(new FileReader(path));
        String str;
        String[] str2 = new String[3];
        int i = 0;
        while ((str = read.readLine()) != null) {
            String result = str.replaceAll("\\D+", "");
            System.out.println(result);
            str2[i] = result;
            i++;
        }
        return str2;
    }
}
