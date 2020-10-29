import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesInlezen2 {

    public static void main(String[] args) {
        try {
            BestandInlezen("Hello2.txt");

        } catch (FileNotFoundException f) {
            System.out.println("Het bestand kan niet worden gelezen");
            System.out.println("Er is de volgende foutmelding" + f.getMessage());
        }
    }

    static void BestandInlezen(String bestandsNaam) throws FileNotFoundException {
        File f = new File("Hello2.txt");
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }

    }

}


