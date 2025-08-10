import exceptions.*;
import model.User;
import service.LoginSystem;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
	
		LoginSystem attempt = new LoginSystem();
		 Scanner in = new Scanner(System.in);
		 

        System.out.println("=== Online Exam - LOGIN ===");
		int shots = 3;
        while (true) {
			
            System.out.print("Introduce Username: ");
            String user = in.nextLine();
            System.out.print("Introduce Password: ");
            String pwd  = in.nextLine();

            try {
                User currentUser = attempt.validateLogin(user, pwd);
                System.out.println("Login successful. Welcome, " + currentUser.getUserName());
                break;   // login OK, move on
            } catch (UserNotFoundException | InvalidPasswordException e) {
                System.out.println(e.getMessage());
				break;
            }
			
        }
		
	
	}
}