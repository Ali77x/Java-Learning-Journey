public class Exercise6{
    public static void main(String[] args){
        //generic methods.
        int quantity = 5;
        String fruit = "Watermelon";
        double price = 12.90;
        StudentRecord<String, Integer> student = new StudentRecord<>("John", 2133);

        print(fruit);
        print(price);
        print(quantity);
        print(student); //displays name of class plus some memory address i think.


    }

    public static <T> void print(T item){
        System.out.println("Item: " + item);
    }
}