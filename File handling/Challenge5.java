import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Challenge5{
    public static void main(String[] args){
        
        try{
            File file = new File("Student_Results.txt");
            Scanner reader = new Scanner(file);
            readContents(reader);
            reader.close();
        }
        catch(IOException e){
            System.out.print(e.getMessage());
        }

    }

    public static void readContents(Scanner reader)
        throws IOException{
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] part = line.split(" - ");
                System.out.println("Name: " + part[0]);
                System.out.println("Marks: " + part[1]);
            }
            
        }
}