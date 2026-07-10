import java.util.LinkedList;
import java.util.Queue;
public class ThreadChallenge{
    public static void main(String[] args){

        Queue<String> queue = new LinkedList<>();
        final int maxQueueSize = 5;

        Supplier supplier = new Supplier(queue, maxQueueSize);
        Consumer consumer = new Consumer(queue);

        Thread supplier1 = new Thread(supplier);
        Thread supplier2 = new Thread(supplier);
        Thread consumer1 = new Thread(consumer);
        Thread consumer2 = new Thread(consumer);

        supplier1.start();
        supplier2.start();
        consumer1.start();
        consumer2.start();

        try{

            supplier1.join();
            supplier2.join();
            consumer1.join();
            consumer2.join();

        }catch(InterruptedException e){
            System.out.println("Thread was Interrupted!");
        }

        
    }
}