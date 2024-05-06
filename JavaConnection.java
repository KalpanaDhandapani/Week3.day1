package com.week3.day1.assignments;

// Implement the interface DatabaseConnection in a Concrete class.
public class JavaConnection implements DatabaseConnection {

	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection(); // class object creation
		System.out.println(" connect(): " + jc.connect(1)); // method call by object reference
		System.out.println(" disconnect(): " + jc.disconnect("Success")); // method call by object reference
		System.out.println(" executeUpdate(): " + jc.executeUpdate(true)); // method call by object reference

	}

	// method returns db connection status
	public int connect(int status) {
		return status;
	}

	// method returns db disconnection status
	public String disconnect(String connect) {
		return connect;
	}

	// method returns db execute update status
	public boolean executeUpdate(boolean status) {
		return status;
	}
}
