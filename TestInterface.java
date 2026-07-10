class TestInterface extends Person implements Worker{
    
    private int workerID;

    public TestInterface(String name, int age, int workerID){
        super(name, age);
        this.workerID = workerID;
    }
    @Override
    public void getRoleResponsibility(){
        System.out.println("Construction worker.");
    }
    @Override
    public void introduce(){
        System.out.println("my name is " + getName() + ", and i am a construction worker.");
    }
    @Override
    public void performDuties(){
        System.out.println("\nWorking at a construction site.");
    }

    public void workerDetails(){
        System.out.print("\nName = " + getName() + "\nAge = " + getAge() + "\nWorker ID = " + workerID);
    }
}