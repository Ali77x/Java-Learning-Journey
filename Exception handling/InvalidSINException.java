//creating a Custom exception.
class InvalidSINException extends Exception{
    public InvalidSINException(String message){
        super(message);
    }
}