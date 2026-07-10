class Student extends Person{
    double gpa;

    Student(String name, String sirName, double gpa){
        super(name, sirName);
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(name + " GPA is " + gpa);
    }

    
        
    
}