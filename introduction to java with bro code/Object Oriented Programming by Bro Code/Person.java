class Person{
    String name;
    String sirName;

    Person(String name, String sirName){
        this.name = name;
        this.sirName = sirName;
    }

    void showName(){
        System.out.printf("%s %s", name, sirName);
    }
}