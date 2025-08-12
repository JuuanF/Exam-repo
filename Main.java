import exceptions.*;
import model.User;
import service.LoginSystem;
import java.util.List;
import data.UserData;
import service.Initialize;
class Main{
	public static void main(String[] args){

		List<User> userList = UserData.getUsers();
		Initialize input = new Initialize();
		
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