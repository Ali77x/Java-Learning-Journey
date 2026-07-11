import java.util.ArrayList;
public class Exercise3{
    public static void main(String[] args){
        Triple<Integer> value1 = new Triple<>();
        Triple<Integer> value2 = new Triple<>();
        Triple<Integer> value3 = new Triple<>();
        ArrayList<Triple<Integer>> values = new ArrayList<>();

        value1.setObject(12);
        value2.setObject(5);
        value3.setObject(1000);

        //let me have some fun with this by using an array list to store the Triple Object;

        values.add(value1);
        values.add(value2);
        values.add(value3);

        //using an enhanced for loop.
        System.out.println("Values Stored:");
        for(Triple<Integer> value: values){
            System.out.println(value.getObject());
        }

    }
}