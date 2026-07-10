public class Main{
    public static void main(String[] args){
        Animal A1 = new Dog();
        A1.bark(); //only methods contained in animal can be executed, the compiler rejects the others.
}