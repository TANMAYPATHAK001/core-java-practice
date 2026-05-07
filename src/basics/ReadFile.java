package basics;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {

        // How to read a file using java (3 popular options)

        // BufferReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g. image, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String filePath = "C:\\Users\\tanma\\OneDrive\\Desktop\\test.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line  = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch (IOException e){
            System.out.println("Something went wrong!");
        }
    }
}