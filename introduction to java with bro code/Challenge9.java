import java.util.LinkedList;
import java.util.Queue;

public class Challenge9{
    public static void main(String[] args){

        final int maxSize = 5;

        Queue<String> queue = new LinkedList<>();

        Runnable consumer = () -> {

                try{
                    for(int i = 0; i < 10; i++){
                        String item;
                        synchronized(queue){
                            while(queue.isEmpty()){
                                queue.wait();
                            }
                        item = queue.remove();
                        queue.notify();    
                        }
                        System.out.println("Processed: " + item);
                        Thread.sleep(700);
                    }
                }catch(InterruptedException e){
                    System.out.println("thread Interrupted!");
                }
            
        };

        Runnable supplier = () -> {
            try {
                    for(int i = 0; i < 10; i++){
                        synchronized(queue){
                            while(queue.size() == maxSize){
                                queue.wait();
                            }
                            queue.add("Item" + i);
                            queue.notify();
                        }
                        
                        System.out.println("Item" + i + " produced");
                        Thread.sleep(500);
                    }
                    
                }catch(InterruptedException e){
                    System.out.println("Thread Interrupted!");
                }
        };

        Thread supplier1 = new Thread(supplier);
        Thread supplier2 = new Thread(supplier);
        Thread consumer1 = new Thread(consumer);
        Thread consumer2 = new Thread(supplier);
         

        consumer1.start();
        supplier1.start();
        consumer2.start();
        supplier2.start();

        try {
            consumer1.join();
            supplier1.join();
            consumer2.join();
            supplier2.join();
        }catch(InterruptedException e){
            System.out.println("Thread Interrupted!");
        }



        
    }
}