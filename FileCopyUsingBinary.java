package Main.java.com.vetias.java.workshop.Standardlibtandardlibtandardlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileCopyUsingBinary {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("Capture.PNG");
            FileOutputStream outputStream = new FileOutputStream("Rishika.PNG") )
            {
                byte[] chunk = new byte[1024];
                int byteRead;
                while ((byteRead = inputStream.read(chunk)) != -1) {
                    outputStream.write(chunk,0,byteRead);  
                }
            
        } catch (Exception e) {
            System.out.println("Error in reading or writing the file");
        }
    }

}
