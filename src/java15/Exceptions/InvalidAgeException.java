package java15.Exceptions;

public class InvalidAgeException extends Exception {

    public InvalidAgeException(){
        super("Возраст не может быть оотрицательным!");
    }

    public InvalidAgeException(String message){
        super(message);
    }
}
