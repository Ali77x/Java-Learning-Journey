//introduction to lambdas.
public class Lesson1{
    public static void main(String[] args){
        //making a interface known as greetings.
        Greetings g = new Greetings(){
            @Override
            public void sayHello(){
                System.out.println("Hey There!");
            }
        };

        g.sayHello();

        //now instead of using an anonymous class we can use a lambda expression.

        Greetings g1 = () -> System.out.println("hello there!");

        g1.sayHello();

        
    }
}