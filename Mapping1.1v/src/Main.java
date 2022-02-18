import java.io.*;
public class Main {

    public static void main(String[] args) {
        Reader read = new Reader();
        try {
            FileReader file = new FileReader("myfile.txt");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            while (line != null) {
                read.newEntry(line);
                line = reader.readLine();
            }
            read.printAll();
        } catch (IOException ioexception) {
            System.out.println("Ack!  We had a problem: " + ioexception.getMessage());
        }
    }
}
