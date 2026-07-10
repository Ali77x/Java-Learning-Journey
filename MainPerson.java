import java.util.ArrayList;
public class MainPerson{
    public static void main(String[] args){
        
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Supervisor> superviseList = new ArrayList<>();

        Teacher t1 = new Teacher("Mr banda", 40, "Programming fundamentals");
        Student s1 = new Student("Mike", 21, "Computer science");
        Student s2 = new Student("Bob", 26, "Mechanical Engineering");
        NonTeachingStaff staff1 = new NonTeachingStaff("Jack", 34, "Sports");

        people.add(t1);
        people.add(s1);
        people.add(s2);
        people.add(staff1);

        superviseList.add(t1);
        superviseList.add(s1);
        superviseList.add(s2);
        superviseList.add(staff1);

        processPeople(people);

    }

    public static void processPeople(ArrayList<Person> people, ArrayList<Supervisor> supervisorList){
        for(Person p : people){

            p.introduce();
            

            System.out.println();   //spacing.
        }

    }
}