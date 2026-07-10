public class Run implements Runnable{

    @Override
    public void run(){
        try{
            for(int i = 1; i <= 20; i++){
                Thread.sleep(1000);
                if(i == 20){
                    System.out.println("You've run out of time.");
                    System.exit(0);
                }
            }
        }catch(InterruptedException e){
            System.out.println("Thread was interrupted.");
        }
    }
}