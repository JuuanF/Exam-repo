package exceptions;
public class InvalidPasswordException extends RuntimeException{
	public InvalidPasswordException(String msj){
		super(msj);
	}
}