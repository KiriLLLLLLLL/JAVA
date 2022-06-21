import java.io.IOException;

public class program {
    public static void main(String[] args) throws IOException {
        Contact contact = importContact.getScannerNumber();

        importContact.writeResult(contact.getContactRows(), "C:/JavaProjects/PhoneBook/book.txt");
        importContact.writeResult(contact.getContactRow(), "C:/JavaProjects/PhoneBook/book2.txt");

    }

}
