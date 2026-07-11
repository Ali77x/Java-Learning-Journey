public class Exercise7{
    public static void main(String[] args){

        String[] names = {"Jack", "John", "Mark", "Joe", "James"};
        
        swap(names, 0, 3);

        for(String name: names){
            System.out.print(name + " ");
        }

        System.out.println();

        Integer[] ages = {3, 12, 42, 23, 55, 6};

        swap(ages, 0, 2);

        for(Integer age: ages){
            System.out.print(age + " ");
        }
        
    }
    public static <T> void swap(T[] array, int i, int j){
        T temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}