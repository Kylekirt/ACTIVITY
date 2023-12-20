package main;

public class User {
	
	private int userID;
	private String userName;
	private String firstName, lastName;
	
	User(int userID, String userName, String firstName, String lastName){
		this.userID = userID;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	void setUserID(int userID) {
		this.userID = userID;
	}
}
