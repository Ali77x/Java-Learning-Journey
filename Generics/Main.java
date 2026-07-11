public class Main{
    public static void main(String[] args){
        //introduction to generics.

        // generic classes
        Box<String> bag = new Box<>();

        bag.setItem("Banana");

        System.out.println("Item in Bag: " + bag.getItem());

        Box<Double> wallet = new Box<>();

        wallet.setItem(12.00);

        System.out.println("Money in wallet: " + wallet.getItem());


        //generic methods
        //instead of creating a new method for every data type, we instead create one generic method for all types.

        Integer[] ages = {12, 21, 45, 100, 1, 5, 55};
        String[] names = {"Jack", "Joe", "John", "Peter", "Mark", "Mike", "Mary"};

        printArray(names);
        printArray(ages);

        compare("Java", "Python");

        compare(21,21);

        mapNameToAge(names, ages);

    }

    public static <T> void compare(T value0, T value1){
        if(value0.equals(value1)){
            System.out.println("Same");

        }else{
            System.out.println("Different");
        }
    }

    public static <T> void printArray(T[] arrayName){
        for(T item: arrayName){
            System.out.print( item + ", ");
        }
        System.out.println();
    }

    public static <K, V> void mapNameToAge(K[] names, V[] ages){
        int track = 0;
        for(K name: names){
            for(int i = track; i < ages.length;){
                System.out.println("Name: " + name + " -> Age: " + ages[i] );
                track++;
                break;
            }
        }
    }
}