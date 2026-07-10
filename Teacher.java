class Teacher extends Person implements Supervisor{
    private String course;

    public Teacher(String name, int age, String course){
        super(name, age);
        this.course = course;
    }

    public void supervise(){
        System.out.println("Can supervise");
    }
    @Override
    public void introduce(){
        System.out.println("My name is " + getName() + ", I am " + getAge() + " years old and I lecture in " + course);
    }

    @Override 
    public void getRoleResponsibility(){
        System.out.println("Can supervise others.");
    }
}