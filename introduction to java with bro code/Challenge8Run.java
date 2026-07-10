class Challenge8Run implements Runnable{

    final private int start;
    final private int stop;
    private int threadNum;
    int[] numbers = new int[16];

    Challenge8Run(int start, int stop,int[] numbers){
        this.start = start;
        this.stop = stop;
        this.numbers = numbers;
    }

    @Override 
    public void run(){
        for(int i = start; i < stop; i++){
            threadNum += numbers[i];
        }
    }

    public int getSum(){
        return threadNum;
    }
}