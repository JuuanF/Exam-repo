package service;
import model.User;
import exceptions.*;
import java.util.List;
import java.util.Scanner;
public class LoginSystem{
	
	
		private Scanner scanner = new Scanner(System.in);

		public String askUserName(){
			System.out.println("Introduce user name");
			return scanner.nextLine();
		}
		
		public String askpassword(){
			System.out.println("Introduce password");
			return scanner.nextLine();
		}
	
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

