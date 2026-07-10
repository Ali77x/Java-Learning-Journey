import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Callable;

public class Exercise5{
    public static void main(String[] args){

        Random random = new Random();
        int[][] tasks = new int[4][25];

        for(int i = 0; i < 4; i++){// collecting random numbers.
            for(int j = 0; j < 25; j++){
                tasks[i][j] = random.nextInt(0, 100);
            }
        }

        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Future<Integer>> futures = new ArrayList<>();

        Callable<Integer> process = () -> { 
            int sum = 0;
            for(int[] task: tasks){
                for(int t: task){
                    sum += t;
                    
                }
                break;
            }
            return sum;
        };
        

        for (int[] task : tasks) {
            // collecting.
            Future<Integer> future = executor.submit(process);
            
            futures.add(future);
        }


        try{

            int[] sum = new int[4];
            int count = 0; 
            int total = 0;
            for(Future<Integer> future: futures){
                sum[count] = future.get();
                total += sum[count];
                count++;

                System.out.printf("Task %d: %d\n", count, sum[count - 1]);

                if(count == 4){
                    double neu = total; double den = futures.size();
                    double average = neu/den;
                    System.out.printf("Average = %.2f", average);
                }
            }
  
        }catch(InterruptedException | ExecutionException e){
            System.out.println("Thread was Interrupted!");
        }

        executor.shutdown();


    }

}