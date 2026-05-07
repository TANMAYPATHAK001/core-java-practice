package basics;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        // How to write a file using java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g. images, audio files)

        String filePath = "C:\\Users\\tanma\\OneDrive\\Desktop\\test.txt";

        String textContent = """
               Angen a Ratram
               Naine Vaktram
               Nyay e na Rajyam
               Labde na Bhojyam
                """;

        try (FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file location!");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }
    }
}