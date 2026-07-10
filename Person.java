abstract class Person{
    private String name;
    private int age;

    public Person(String name, int age ){
        this.name = name;
        this.age = age;
    }

    //abstract means that every class that is a sub class of the person class must have the abstract function depending oon the behaviour (polymorphism).
    public abstract void introduce();

    public abstract void getRoleResponsibility();

    public void birthday(){
        age++;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}