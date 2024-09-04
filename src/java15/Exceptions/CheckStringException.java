package java15.Exceptions;

public class CheckStringException extends Exception {

    public CheckStringException(){
        super("Строка не может быть пустой ");

    }
    public CheckStringException(String message){
        super(message);
    }
}
