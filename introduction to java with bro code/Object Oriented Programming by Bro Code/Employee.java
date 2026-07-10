class Employee{
    int salary;

    Employee(String name, String sirName, int salary){
        super(name, sirName);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(name + " salary is " + salary);
    }
}