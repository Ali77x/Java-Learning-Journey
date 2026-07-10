class Student extends Person implements Supervisor{
    private String program;

    public Student(String name, int age, String program){
        super(name, age); // calls a constructor from a parent class.
        this.program = program;
    }

    public void supervise(){
        System.out.println("Can not supervise");
    }
    @Override
    public void introduce(){
        System.out.println("My name is " + getName() + ", I am " + getAge() + " years old and I am a student studying " + program);
    }

    @Override
    public void getRoleResponsibility(){
        System.out.println("Needs supervision.");
    }
}