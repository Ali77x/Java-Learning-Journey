import java.util.Scanner;

// enums of days 
enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
public class Enums{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){

        try{

                    System.out.print("Enter visit day: ");
                    String userInput = input.next();
                    Days day = Days.valueOf(userInput.toUpperCase());

                    System.out.println("Visitation day set to " + userInput);
                    break;

                }catch(IllegalArgumentException e){
                    System.out.println("Invalid input");
                }
            }

    }
}