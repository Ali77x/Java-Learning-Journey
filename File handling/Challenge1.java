import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Challenge1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        try{
            FileWriter writer = new FileWriter("names.txt", true);
            getName(input, writer);
        }
        catch(IOException e){
            System.out.print(e.getMessage());
        }
        input.close();
    }

    public static void getName(Scanner input, FileWriter writer)
        throws IOException{
            System.out.print("Enter name: ");
            String name = input.nextLine();
            writer.write(name + "\n");
            writer.close();
            System.out.print("name written to file.");
    }
}