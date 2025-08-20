package service;
import model.User;
import java.util.Scanner;
public class Initialize{ //pertenece a loginSystem

// load users, exams, questions, menu

		private Scanner scanner = new Scanner(System.in);

		public String askUserName(){
			System.out.println("Introduce user name");
			return scanner.nextLine();
		}
		
		public String askpassword(){
			System.out.println("Introduce password");
			return scanner.nextLine();
		}
}