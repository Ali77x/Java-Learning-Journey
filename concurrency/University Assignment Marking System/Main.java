import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

public class Main{
       public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(4);

        Future<Integer> future;
        ArrayList<Future<Integer>> futures = new ArrayList<>();
        Random random = new Random();

        AssignmentTask student;

        for(int i = 1; i <= 20; i++){
            try{
                final int studentNumber = i;
                student = new AssignmentTask(random.nextInt(1000, 10000), studentNumber);
                future = executor.submit(student);
                futures.add(future);
            }catch(RejectedExecutionException | NullPointerException e){
                System.out.println("Error while running task!");
            }
        }

        int sum = 0;
        try{
            for(Future<Integer> f: futures){
                sum += f.get();
            }
        }catch(InterruptedException | ExecutionException e){
            System.out.println("Error occured!");
        }

        System.out.println("Average Score: " + sum / futures.size());

        executor.shutdown();

    }
}