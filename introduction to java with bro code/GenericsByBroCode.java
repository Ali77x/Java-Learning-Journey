
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class GenericsByBroCode{
    public static void main(String[] args){

        //multithreading = enables a program to run multiple thread concurrently

        








        // //multipliyer game. uses Run class.

        // Scanner input = new Scanner(System.in);
        // Random random = new Random();
        // int correctAttempts = 0;
        // int totalQuestions= 0;

        // Run run = new Run();
        // Thread thread = new Thread(run);

        // thread.setDaemon(true);
        // thread.start();

        // for(int i = 0; i < 100; i++){

        //     int x, y, z;

        //     x = random.nextInt(0, 11); y = random.nextInt(0, 11);

        //     totalQuestions++;
        //     System.out.printf("What is %d X %d: ", x, y);
        //     z = input.nextInt();


        //     if(z == x * y){
        //         System.out.println("CORRECT!");

        //         correctAttempts++;
        //     }else{
        //         System.out.println("WRONG!");
        //     }

        // }



        // input.close();







        //threading -> allows a program to run multiple tasks simultaneously. helps improve performance with time consuming operations.
        //  (File IO, netWork Communications or any background tasks).

        //how to do this 
        //1. Extend the thread class (Simpler).
        //2. Implement the runnable interface. (Better).

        // Scanner input = new Scanner(System.in);

        // MyRunnable run = new MyRunnable();
        // Thread thread = new Thread(run);

        // thread.setDaemon(true); //program ends when main thread stops.
        // thread.start();

        // System.out.println("You have 5 seconds to enter your name.");
        // System.out.print("Enter your name: ");
        // String name = input.nextLine();

        // System.out.println("Hello " + name);

        // input.close();





        //Enums
        
        // try(Scanner input = new Scanner(System.in);){

        //     System.out.print("Enter the day today: ");
        //     Day day = Day.valueOf(input.nextLine().toUpperCase());
        //     dayType(day);

        // }catch(IllegalArgumentException e){
        //     System.out.println("that is not a day");
        // }




        //hashmaps by bro code.

        // HashMap<String, Double> items = new HashMap<>();

        // items.put("Coconut", 2.5);
        // items.put("Apple", 0.50);
        // items.put("Peach", 1.00);
        // items.put("Lemon", 0.75);

        //System.out.println(items); //-> output all items.

        //System.out.println(items.containsKey("Coconut")); //->check if collection contains the specific key.

        //System.out.println(items.containsValue(0.75)); //-> checks if any key contains th especified value.

        //System.out.println(items.remove("Coconut")); //-> removes an item from the collection.
        // items.remove("Coconut");
        // System.out.println(items);

        // for(String key: items.keySet()){    //displaying a different type of format.
        //     System.out.println(key +  ": $" + items.get(key));
        // }




        
        //Generics -> a concept where you can write a class, interface, or method that is compatible with different data types.
        //<T> is a type parameter that get to be replaced with a real type. -> used when we dont know the data type thats going to be used.
        //<String> type argument (Specifies the type).


        // ArrayList<String> fruits = new ArrayList<>(); //-> we always have to specify the type of datat stored in an array list hence generics comes in.

        // fruits.add("apple");
        // fruits.add("Mango");
        // fruits.add("Orange");
        // fruits.add("Watermelon");

        // Box<String> box = new Box<>();

        // box.setItem("Banana");

        // System.out.println(box.getItem());

        // Box<Integer> box1 = new Box<>();

        // box1.setItem(34);

        // System.out.println(box1.getItem());


        // Product<String, Double> product = new Product<>("Apple", 12.5);

        // System.out.println(product.getItem() + " -> " + product.getPrice());




    }

    static void dayType(Day day){
        switch(day){
            case MONDAY, TUESDAY,  WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a weekday");
            case SATURDAY, SUNDAY -> System.out.println("It is the weekend");
            default -> System.out.println("That is not a day.");
        };
    }
}