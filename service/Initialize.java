package service;
import model.User;
import java.util.List;
import data.UserData;
import exceptions.*;
public final class Initialize{ //pertenece a loginSystem

// load users, exams, questions, menu

	public static void run(){
		
		List<User> userList = UserData.getUsers();
		LoginSystem input = new LoginSystem();
		
		System.out.println("=== Online Exam - LOGIN ===");
		try{
			String userName = input.askUserName();
			User user = LoginSystem.validateUserName(userList, userName);
			String password = input.askpassword();
			LoginSystem.validatePassword (user, password);
			
			if(user.getType().equalsIgnoreCase("Student")){
				System.out.println("Welcome, exam list available");
			}else if(user.getType().equalsIgnoreCase("Manager")){
				System.out.println("Welcome, you can create exams");
			}
		}catch(UserNotFoundException | InvalidPasswordException e){
			System.out.println("Error " + e.getMessage());
		}
		
	}
}