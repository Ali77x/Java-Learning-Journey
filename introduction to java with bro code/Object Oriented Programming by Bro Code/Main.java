import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        



       






        // ArrayList<String> fruits = new ArrayList<>();

        // fruits.add("Orange");
        // fruits.add("Pineapple");
        // fruits.add("Apple");
        // fruits.add("Banana");
        

        // System.out.println(fruits);

        // fruits.set(0, "Mango");

        // System.out.println(fruits);

        // fruits.remove(0);

        // System.out.println(fruits);

        // System.out.println(fruits.get(0));

        // System.out.println(fruits.size());

        // Collections.sort(fruits);

        // System.out.println(fruits);







        // //wrapper classes -> allows primitive values (int char, double, boolean)
        //                     //to be used as objects. "wrap them in an object"
        //                     //generally dont wrap primitives unless you need an object.
        
        // //instead of saying int a = 123;
        // // Integer a = new Integer(123);
        // // Double b = new Double(12.2);
        // // Character c = new Character('%');
        // // Boolean d = new Boolean(true);

        // String a = Integer.toString(123);
        // String b = Double.toString(3.43);
        // String c = Character.toString('%');
        // String d = Boolean.toString(false);

        // String com = a + b + c + d;

        // System.out.println(com);

        // //parseing
        // int e = Integer.parseInt(a);
        // double f = Double.parseDouble(b);
        // char g = c.charAt(0);
        // boolean h = Boolean.parseBoolean(d);

        // System.out.printf("%d %.2f %s %b\n", e, f, g, h);

        // char letter = 'b';

        // System.out.println(Character.isLetter(letter));
        // System.out.println(Character.isUpperCase(letter));







        // //Composition -> Represents a "part-of" relationship between objects.
        // //              for example, an engine is part of a car.

        // Car car = new Car("Hammer", 2015, "V7");

        // System.out.println(car.model + " " + car.year + " " + car.engine.type);

        // car.start();





        //Aggregation ->represents a "has-a" relationship between objects.
            //one object contains another object as part of its structure.
            //but the contained object(s) can exist independently.
            //classes used are Book class and Library Class.

            // Book book1 = new Book("Lord of the rings", 250);
            // Book book2 = new Book("Two towers", 400);
            // Book book3 = new Book("Ellen white", 105);

            // Book[] books = {book1, book2, book3};

            // Library library = new Library("NYC Public Library", 1897, books);

            // library.displayInfo();
        




        // //abstraction.  //used the shape class.
        // Triangle triangle = new Triangle(2.5, 5.8);
        // Circle circle = new Circle(3.0);
        // Rectangle rectangle = new Rectangle(2.34, 7.2);

        // System.out.printf("\nCircle Area = %.2f", circle.area());
        // System.out.printf("\nTriangle Area = %.2f", triangle.area());
        // System.out.printf("\nRectangle Area = %.2f", rectangle.area());



        // //using the Person, Employee and student class.
        // Person person1 = new Person("RikPopTheMyth", "Shelby");
        // Student student = new Student("Jack", "Myth", 3.5);

        // person1.showName();
        // student.showName();




        // //static -> makes a variable or method belong to the class rather than to specific objects. 
        // //name of class used is Friends

        // Friends friend1 = new Friends("RikPopTheMyth");
        // Friends friend2 = new Friends("Jack smith");
        // Friends friend3 = new Friends("Ricky Rick");

        // Friends.printNumberOfFriends();





        // //arrays and objects. name of class used is Car.
        // Car car1 = new Car("Mustang", "Red");
        // Car car2 = new Car("Dodge", "Black");
        // Car car3 = new Car("BMW", "White");

        // Car[] cars = {car1, car2, car3};

        // for(Car car: cars){
        //     System.out.println(car.model + " -> " + car.color);
        // }

        // //or this could be written as if you need anonymous objects.

        // Car[] vehicles = {new Car("Hammer", "Blue"), new Car("Honda", "gray"), new Car("Toyota", "Black")};

        // for(Car v: vehicles){
        //     System.out.println(v.model + " -> " + v.color);
        // }







    //     //Overloaded constructors. class name (User)

    //     User user1 = new User("Ali77x");
    //     User user2 = new User("RikPopTheMyth", "rikpopthemyth@gmail.com");
    //     User user3 = new User("Jack smith", "Jmyth@gmail.com", 25);

    //     System.out.println(user1.email);
    //     System.out.println(user1.userName);
    //     System.out.println(user1.age);

    //     System.out.println(user2.email);
    //     System.out.println(user2.userName);
    //     System.out.println(user2.age);
        
    //     System.out.println(user3.email);
    //     System.out.println(user3.userName);
    //     System.out.println(user3.age);

    }
}