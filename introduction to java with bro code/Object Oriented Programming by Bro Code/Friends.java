class Friends{

    static int numOfFriends;    //this belongs to class instead of a specific method.

    String name;


    Friends(String name){
        this.name = name;
        numOfFriends++;
    }

    static void printNumberOfFriends(){ //you cannot reference a static method from a non static on or vice-versa.
        System.out.println("you have " + numOfFriends + " total number of friends");
    }


}