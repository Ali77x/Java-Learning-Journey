class Dog extends Animal{
    private String sound;

    public Dog(String name, int age, String sound){
        super(name, age);
        this.sound = sound;

    }

    public void makeSound(){
        System.out.println(sound);
    }
}