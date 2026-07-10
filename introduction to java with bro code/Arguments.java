public class Arguments{

    public static void main(String[] args){
        System.out.println(add(1, 2, 3, 5));
       
    }

    static int add(int... numbers){ //instead of method overloading.
        int sum = 0;

        for(int number: numbers){
            sum += number;
        }

        return sum;
    }
}