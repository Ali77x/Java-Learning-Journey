import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args){
        writeToFile();
        readFile();
    }

    public static void writeToFile(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Students.txt")); Scanner input = new Scanner(System.in)){
            for(int i = 0; i < 5; i++){
                System.out.print("Enter name: ");
                writer.write(input.nextLine());
                writer.newLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(){
        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader("Students.txt"))){
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}