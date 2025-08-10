package exceptions;
public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String msj){
		super(msj);
	}
}