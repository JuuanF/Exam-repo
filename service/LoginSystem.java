package service;
import java.util.Map;
import java.util.HashMap;
import model.User;
import exceptions.*;
public class LoginSystem{
	
	Map<String, User> userList;
	
	public LoginSystem(){
	
		userList = new HashMap<>(); 
		
		userList.put("juanF", new User("juanF","1234","student"));
		userList.put("marioS", new User("marioS","pass","student"));
		userList.put("ludC", new User("ludC","0000","student"));
	}
	
	public User validateLogin (String userName, String password){
	
		User user = userList.get(userName);    
		 
        if (user == null) {
            throw new UserNotFoundException("Username not found");
        }
        if (!user.getPassword().equals(password)) {
            throw new InvalidPasswordException("Password is incorrect");
        }
        return user;
	
	}

}