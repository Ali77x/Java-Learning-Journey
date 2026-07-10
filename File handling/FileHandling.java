import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        writeNames(input);
        readNames();
        input.close();
    }

    public static void writeNames(Scanner input){
        try{
            FileWriter writer = new FileWriter("Test.txt");
            for(int i = 0; i < 5; i++){
                System.out.print("Enter name: ");
                String name = input.nextLine();
                System.out.print("Enter SIN: ");
                int sin = input.nextInt();
                input.nextLine();   //clear input buffer.

                writer.write(name + " - " + sin + "\n");
            }
            writer.close();
                
        }catch(IOException e){
            System.out.println("Error occured while writing to file.");
        }
    }


    public static void readNames(){
        try{
            File file = new File("test.txt");
            Scanner reader = new Scanner(file);
            System.out.println("Names from file.");
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] part = line.split(" - ");
                System.out.println("Name: " + part[0] + "\nSIN: " + part[1]);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("File name not found.");
        }
    }
}