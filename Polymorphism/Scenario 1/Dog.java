class Dog extends Animal{
//if the sound function isnt available therefore the main class would therefore run the Animal sound version.
    @Override
void sound(){
    System.out.println("Dog Barks");
}
}