import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFileContents{
    public static void main(String[] args){

        try{
            File file = new File("Student_Results.txt");
            Scanner reader = new Scanner(file); //Scanner input to read file input.

            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

        }
        catch(IOException e){
            System.out.print(e.getMessage());
        }
        
    }

}