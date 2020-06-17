package collection.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderLesson {
    public static void main(String[] args)  {

        try {
    //        FileReader reader = new FileReader("myFile.txt");
            FileReader reader = new FileReader("C:\\Users\\ahmed\\OneDrive\\Desktop\\experiment\\hello.txt");
            BufferedReader myReader = new BufferedReader(reader);

            String text = myReader.readLine();

            //while (text != null) {
                System.out.println(text);


            myReader.close();
        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
