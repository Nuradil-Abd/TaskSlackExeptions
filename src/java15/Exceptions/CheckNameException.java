package java15.Exceptions;

public class CheckNameException extends  Exception{

    public CheckNameException(){
        super("Имя не может быть пустым!");
    }
    public CheckNameException(String message){
        super(message);
    }
}
