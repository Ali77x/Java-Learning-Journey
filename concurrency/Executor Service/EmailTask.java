class EmailTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Sending task Through Email!");
    }
}