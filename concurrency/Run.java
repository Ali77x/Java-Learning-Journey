class Run implements Runnable{
    private int balance;

    public Run(int balance){
        this.balance = balance;
    }

@Override
public void run(){
    System.out.println ("Current balance: " + balance);
}

public void withdraw(int amount){
    if(balance >= amount){
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    } else {
        System.out.println("Insufficient funds for withdrawal of: " + amount);
    }
}

public void deposit(int amount){
    if(amount > 0){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }else{
        System.out.println("Invalid deposit amount!");
    }
}


}