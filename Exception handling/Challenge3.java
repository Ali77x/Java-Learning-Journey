import java.util.Scanner;
public class Challenge3{
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
    while(true){
        try{
            System.out.print("Enter age: ");
            int age = input.nextInt();
            if(age < 0)
                throw new IllegalArgumentException("\nAge cannot be negative.");

            System.out.print("Age entered is: " + age);
            break;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

        input.close();
        
    }
}