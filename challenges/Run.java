class Run implements Runnable{

    final private int j;
    public Run(int j){
        this.j = j;
    }

    @Override 
    public void run(){
        try{
            for(int i = 0; i <= 10; i ++){
                double neu = i;
                double percentage = neu/10.0 * 100;
                System.out.println("Download " + j + ": " + percentage + "%");
                Thread.sleep((long)(Math.random() * 1000) + 500);
            }
        }catch(InterruptedException e){
            System.out.println("Thread Interrupted!");
        }finally{
            System.out.println("Download " + j + " Complete");
        }
    }

}