public class Exercise9{
    public static void main(String[] args){
        String[] names = {"Jack", "Mark", "Joe", "Kelvin"};

        System.out.println("Last Element: " + last(names));

        Integer[] ages = {12, 2, 50, 22, 11};

        System.out.println("Last Element: " + last(ages));
     }

    public static <T> T last(T[] array){
        return array[array.length - 1];
    }
}