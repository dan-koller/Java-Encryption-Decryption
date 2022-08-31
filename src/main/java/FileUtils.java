import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileUtils {

    /**
     * Read the content of a file and return it as a String.
     *
     * @param fileName The name of the file to be read.
     * @return The content of the file as a String.
     */
    @SuppressWarnings("StringConcatenationInLoop")
    public static String readFile(String fileName) {
        String data = "";
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                data += scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return data;
    }

    /**
     * Write the content to a file.
     *
     * @param fileName The name of the file to be written to.
     * @param content  The content to be written to the file.
     */
    public static void writeFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
