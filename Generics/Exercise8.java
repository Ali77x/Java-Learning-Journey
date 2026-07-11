public class Exercise8{
    public static void main(String[] args){
        
        String[] names = { "Jack", "Mark", "james", "Joe"};

        System.out.println("First Element: " + first(names));

        Integer[] ages = {12, 21, 1, 55, 10};

        System.out.println("First Element: " + first(ages));

    }

    public static <T> T first(T[] array){
        return array[0];
    }
}