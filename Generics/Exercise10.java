import java.util.Random;

public class Exercise10{
    public static void main(String[] args){
        //returning a random element.

        Random index = new Random();

        String[] names = {"Jack", "Joe", "John", "Mark", "Matthew"};

        System.out.println("Random name: " + random(names, index));

        Integer[] ages = {12, 2, 22, 11, 55, 100};

        System.out.println("Random Age: " + random(ages, index));

    }

    public static <T> T random(T[] array, Random index){
        return array[index.nextInt(0, array.length)];
    }
}