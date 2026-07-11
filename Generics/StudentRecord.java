class StudentRecord<ID, NAME>{
    private final ID id;
    private final NAME name;

    public StudentRecord(ID id, NAME name){
        this.name = name;
        this.id = id;
    }

    public ID getId(){
        return id;
    }

    public NAME getName(){
        return name;
    }

    public void displayStudent(){
        System.out.println("Student Name: " + name + "\nStudent ID: " + id);
    }
}