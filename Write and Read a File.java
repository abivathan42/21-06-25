import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        String filename = "output.txt";

        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello from Java File IO!");
            writer.close();
            System.out.println("Data written to file.");

            FileReader reader = new FileReader(filename);
            int ch;
            System.out.print("Data read from file: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
