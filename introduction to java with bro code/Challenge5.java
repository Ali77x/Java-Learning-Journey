
public class Challenge5{
    public static void main(String[] args){
        
        Counter count = new Counter();

        Runnable task = () -> {

            count.incrementCounter();
            

        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread2.start();
        thread1.start();

        try{
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){
            System.out.println("Thread interrupted.");
        }

            System.out.println("Counter = " + count.getValue());
        

    }

}