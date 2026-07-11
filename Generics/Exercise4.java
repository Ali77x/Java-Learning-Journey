public class Exercise4{
    public static void main(String[] args){
        
        StudentRecord<Integer, String> student = new StudentRecord<>(2213, "Jack");

        System.out.println("Student Name: " + student.getName() + "\nStudent ID: " + student.getId());

        // or and better implementation

        student.displayStudent();

    }
}