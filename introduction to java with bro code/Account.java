class Account{
    private double balance = 10000;


    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){


        balance -=amount;
    }

    public  double getBalance(){
        return balance;
    }
}