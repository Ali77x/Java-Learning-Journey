public class Main{
    public static void main(String[] args){
        Animal A1 = new Dog();

        Dog d = (Dog) A1; // this is known as downcasting since you can only reference methods from the parent class.

        d.bark();   // this is the only way the bark function in the class "Dog" can be accessed using polymorphism.
    }
}