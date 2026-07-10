import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutionException;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class Exercise4{
    public static void main(String[] args){

        Random random = new Random();
        ExecutorService executor = Executors.newFixedThreadPool(4);

        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++){
            numbers[i] = random.nextInt(0, 100);
        }

        //first proposal.
        // int[][] collections = new int[4][25];
        
        // int[] count = {0};

        // for(int k = 0; k < 4; k++){
        //     executor.execute(() -> {

        //         for(int i = 0; i < 4; i++){
        //             for(int j = count[0]; j < count[0] + 25; j ++){
        //                 collections[i][j] = numbers[j];
        //             }
        //             count[0] += 25;   
        //         }
        //     });
        // }


        // int[] task1 = new int[25];
        // int[] task2 = new int[25];
        // int[] task3 = new int[25];
        // int[] task4 = new int[25];
        
        // getNumbers(task1, numbers, 0);
        // getNumbers(task2, numbers, 25);
        // getNumbers(task3, numbers, 50);
        // getNumbers(task4, numbers, 75);

        // int[] task1 = Arrays.copyOfRange(numbers, 0, 25);
        // int[] task2 = Arrays.copyOfRange(numbers, 25, 50);
        // int[] task3 = Arrays.copyOfRange(numbers, 50, 75);
        // int[] task4 = Arrays.copyOfRange(numbers, 75, 100);

        int[][] tasks = new int[4][];
        int start = 0; 
        
        for(int i = 0; i < 4 ; i++){
            tasks[i] = getNumbers(numbers, start);
            start += 25;
        }

        int [] num = new int[4];
        int count = 0;

        List<Future<Integer>> futures = new ArrayList<>();

        for(int[] task: tasks){
               
                Future<Integer> future = executor.submit(
                    () -> getLargestNumber(task)
                );

             futures.add(future);  +
        }

        try{

            for(Future<Integer> f: futures){
                num[count] = f.get();
                count++;
            }
            count = 0;
            for(int n: num){
                count++;
                System.out.println("Task " + count + " max number: " + n);
            }

            System.out.println("Final Max: " + Math.max(Math.max(num[0], num[1]), Math.max(num[2], num[3])));
        }catch(InterruptedException | ExecutionException e){
            System.out.println("thread Interrupted or Error while Executing!");
        }
            
        executor.shutdown();
        


        
        // Callable<Integer> t1 = () -> {
        //     return getLargestNumber(task1);
        // };

        // Callable<Integer> t2 = () -> {
        //     return getLargestNumber(task2);
        // };

        // Callable<Integer> t3 = () -> {
        //     return getLargestNumber(task3);
        // };

        // Callable<Integer> t4 = () -> {
        //     return getLargestNumber(task4);
        // };



        // Future<Integer> f1 = executor.submit(t1);
        // Future<Integer> f2 = executor.submit(t2);
        // Future<Integer> f3 = executor.submit(t3);
        // Future<Integer> f4 = executor.submit(t4);

        // try{
        //     System.out.printf("Task 1 Max number: %d\n", f1.get());
        //     System.out.printf("Task 2 Max number: %d\n", f2.get());
        //     System.out.printf("Task 3 Max number: %d\n", f3.get());
        //     System.out.printf("Task 4 Max number: %d\n", f4.get());

        //     System.out.println("Final Max: " + Math.max(Math.max(f1.get(), f2.get()), Math.max(f3.get(), f4.get())));            

        // }catch(InterruptedException | ExecutionException e){
        //     System.out.println("Thread was Interrupted!");
        // }
        
    }

    public static int getLargestNumber(int[] array){
        int largestNumber = array[0];
        for(int num: array){
            if (largestNumber < num){
                largestNumber = num;
            }
        }
        return largestNumber;
    }


    public static int[] getNumbers(int[] numbers, int start){
        return Arrays.copyOfRange(numbers, start, start + 25);
    }
}