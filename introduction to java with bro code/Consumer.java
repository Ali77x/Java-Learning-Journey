import java.util.Queue;
class Consumer implements Runnable{

    private Queue<String> queue;

    @Override
    public void run(){
        try {
            for(int i = 0; i < 10; i++){
                while(queue.isEmpty()){
                    wait();
                }
            }
        }catch(InterruptedException e){
            System.out.println("Thread Interrupted!");
        }
        
    }

    public void setQueue(Queue<String> queue){
        this.queue = queue;
    }

}