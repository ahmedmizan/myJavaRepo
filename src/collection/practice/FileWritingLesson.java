package collection.practice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWritingLesson {
    public static void main(String[] args) {

       try {
         //  FileWriter file = new FileWriter("myFile.txt");
           FileWriter file = new FileWriter("C:\\Users\\ahmed\\OneDrive\\Desktop\\experiment\\hello.txt");
           PrintWriter writer = new PrintWriter(file);

           writer.println("This is my first file writing.");
          // writer.println("I am a good programmer.");

           writer.close();

       }catch (IOException e){
           e.printStackTrace();
       }


    }
}
