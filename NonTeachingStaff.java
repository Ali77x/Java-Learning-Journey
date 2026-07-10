class NonTeachingStaff extends Person implements Supervisor{
    private String department;

    public NonTeachingStaff(String name, int age, String department){
        super(name, age);
        this.department = department;
    }
    
    public void supervise(){
        System.out.println("Can supervise.");
    }
    
    @Override
    public void introduce(){
        System.out.println("My name is " + getName() + ", I am " + getAge() + " years old and I am from the " + department + " department.");
    }

    @Override
    public void getRoleResponsibility(){
        System.out.println("Handles administrative responsibilities.");
    }
}