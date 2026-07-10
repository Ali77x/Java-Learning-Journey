import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource{   //try with resources automatically closes resources instead of manually doing them

    public static void main(String[] args){
        //Buffered writer.
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Test.txt"))){
            writer.write("Jack");
            writer.newLine();
            writer.write("John");
            writer.newLine();
            writer.write("Mary");
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //Buffered reader.

        try(BufferedReader reader = new BufferedReader(new FileReader("Test.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}