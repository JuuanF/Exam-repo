package service;
import java.util.List;
import model.User;
import exceptions.*;
public class LoginSystem{
	
	public static User validateUserName(List<User> users, String userName){
	
		for(User u : users){
			if(u.getUserName().equals(userName)){
				return u;
			}
		}
		throw new UserNotFoundException("Username not found");
		}
		 
	public static void validatePassword(User user, String password){ 

		if(!user.getPassword().equals(password)){
			throw new InvalidPasswordException("Incorrect password");
		}
	
	
	}
	
}

