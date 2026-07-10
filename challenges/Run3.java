class Run3 implements Runnable{
    private final int number;

    public Run3(int number){
        this.number = number;
    }
    @Override
    public void run(){
        int result = 1;
        for(int i = number; i > 0; i --){
            result *= i;
        }
        System.out.println("Results = " + result);
    }
}