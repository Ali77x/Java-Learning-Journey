import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Exercise3{
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(3);

    // for(int i = 5; i <= 8; i++){
        //     executor.execute(new Run3(i));
        // }

        for(int i = 5; i <= 8; i++){
            final int number = i;
            executor.execute(() -> {
                int result = 1;
                for(int j = 1; j <= number; j++){
                    result *= j;
                }
                System.out.println(number + "! = " + result);
            });
        }


        executor.shutdown();
    }
}