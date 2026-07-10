public class User{
    String userName;
    //lets say the atributes below are optiinal.
    String email;
    int age;

    User(String userName){
        this.userName = userName;
        this.email = "Not provided.";
        this.age = 0;
    }

        User(String userName, String email){
            this.userName = userName;
            this.email = email;
            this.age = 0;
        }

        User(String name, String email, int age){
            this.userName = name;
            this.email = email;
            this.age = age;
        }

    
}