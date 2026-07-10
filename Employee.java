class Employee extends Person{

    private double salary;

    Employee(String name, int age, double salary){
        super(name, age);   //inherits the constructor from the super class "Parent".
        this.salary = salary;
    }

    @Override // Overrides if there is a typo still works and makes things a bit safe.
    public void introduce(){
        System.out.println(" I am an Employee with a salary of " + salary);
    }

}