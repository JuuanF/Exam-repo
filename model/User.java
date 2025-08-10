package model;
public class User{
	private String userName;
	private String password;
	private String profile; // use later for Exam managers
	
	public User(String userName, String password, String profile){
		this.userName = userName;
		this.password = password;
		this.profile = profile;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getProfile(){
		return profile;
	}
}