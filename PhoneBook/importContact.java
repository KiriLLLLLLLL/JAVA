
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class importContact {
    static void writeResult(String str, String path) throws IOException {
        FileWriter writer = new FileWriter(new File(path), true);
        {
            writer.write(str);
            writer.flush();
        }
    }

    static Contact getScannerNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input id : ");
        Integer id = in.nextInt();
        System.out.print("Input name : ");
        String fname = in.nextLine();
        System.out.print("Input number : ");
        String number = in.nextLine();

        return new Contact(id, fname, number);

    }

}
