import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
        // introduction to java API Streams.

        ArrayList<String> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Enter name: ");
            names.add(input.nextLine());
        }
        input.close();
        space();
        names.stream().forEach(name -> System.out.println(name));   // using the forEach key word 
        //the line above is equivalent to for(String name: names){System.out.println(name);} prints every element in the collection
        space();
        names.stream().filter(name -> name.startsWith("j")).forEach(System.out::println);   //using the key word "filter".
        space();
        //transformation of data using the map key word.
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println); //transforms every element to uppercase.

        space();
        //collect() key word for collecting elements t a new collection.
        ArrayList<String> newNames = names.stream().filter(name -> name.length() > 4).collect(Collectors.toCollection(ArrayList::new));
        
        newNames.stream().forEach(name -> System.out.println(name));
        space();
        //count() key word to count elements in a collectiion.
        long total = newNames.stream().filter(name -> name.startsWith("J")).count();
        System.out.println(total);

        space();

        //sorted() key word to sort elements in a collection.
        names.stream().sorted().forEach(System.out::println);
        
    }

    public static void space(){
        System.out.println();
    }
}