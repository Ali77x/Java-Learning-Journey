import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args ){
        
        try{
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write("Hello world.");
            writer.close();
            System.out.println("Successfully written to file.");
        }
        catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
}