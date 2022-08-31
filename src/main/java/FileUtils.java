import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileUtils {

    @SuppressWarnings("StringConcatenationInLoop")
    public static String readFile(String fileName) {
        String data = "";
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                data += scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
//            System.out.println("Error: " + e.getMessage());
        }
        return data;
    }

    public static void writeFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
