import java.io.IOException;
import java.util.ArrayList;

public class program {
    public static void main(String[] args) throws IOException {
        // Contact contactInput = importContact.getScannerNumber();

        // importContact.writeResult(contactInput.getContactRows(),
        // "C:/JavaProjects/PhoneBook/book.txt");
        // importContact.writeResult(contactInput.getContactRow(),
        // "C:/JavaProjects/PhoneBook/book2.txt");
        ArrayList<String> contactArray = new ArrayList<>();
        contactArray = exportContact.expContactRow("C:/JavaProjects/PhoneBook/book.txt");
        Contact contactOutput = exportContact.findContact(contactArray, 4);
        System.out.println(contactOutput.getContactRow());
        System.out.println(contactOutput.getContactRows());
    }

}
