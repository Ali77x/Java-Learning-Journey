public class Challenge1{
    public static void main(String[] args){
        
        int[] counter = new int[1];
        counter[0] = 0;

        

        Runnable task = () -> {
            for(int i = 1; i < 100000; i++){
                counter[0]++;
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

            thread1.start();
            thread2.start();

        try{
            thread1.join();
            thread2.join();
            

        }catch(InterruptedException e){
            System.out.println("Thread Interrupted.");
        }finally{

            System.out.println("Counter = " + counter[0]);
        }

    }

        
}