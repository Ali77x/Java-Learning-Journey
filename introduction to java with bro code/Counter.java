public class Counter{

    private int counter;
    
    public synchronized void incrementCounter(){
        for(int i = 1; i <= 100000; i++){
            counter++;
        }
    }

    public synchronized int getValue(){
        return counter;
    }
}