import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashSet;
import java.util.HashMap;

public class HashMaps{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HashSet<Integer> ids = new HashSet<>();
        HashMap<Integer, String> idToNameMap = new HashMap<>();

        getUserInfo(input, ids, idToNameMap);
        printUserInfo(idToNameMap);
    }

    public static void getUserInfo(Scanner input, HashSet<Integer> ids, HashMap<Integer, String> idToNameMap){

        for(int i = 0; i < 5; i++){
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            getValidId(input, ids, idToNameMap, name);
        }
    }

    public static void getValidId(Scanner input, HashSet<Integer> ids, HashMap<Integer, String> idToNameMap, String name){
        int id;
        while(true){
            id = validateId(input); // validate input(Input mismatch exception).
            boolean added = ids.add(id);
            if(added){
                System.out.println("Id successfully added.");
                break;
            }
        }

        idToNameMap.put(id, name);
        input.nextLine();   //clear input buffer.
        
    }

    public static int getValidInteger(Scanner input, String prompt){
        while(true){
            try{
            System.out.print(prompt);
                return input.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Invalid input, try again.");
            }
        }
    }

    public static void validateId(Scanner input){
        while(true){
            try{
                int id = getValidInteger(input, "Enter ID: ");
                throwException(id);
                break;

            }catch(InvalidIdException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void throwException(int id)
    throws InvalidIdException{
        if(id < 1000 || id > 9999){
            throw new InvalidIdException("ID entered is invalid try again.");
        }
    
    }

    public static void printUserInfo(HashMap<Integer, String> idToNameMap){
        for(int key: idToNameMap.keySet()){
            System.out.println(key + " -> " + idToNameMap.get(key));
        }
    }
}