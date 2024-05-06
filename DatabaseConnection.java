package com.week3.day1.assignments;

// Create an interface DatabseConnection with the following abstract methods
public interface DatabaseConnection {

	public int connect(int status); //return 1 or 0; 1=success; 0=failure

	public String disconnect(String connect); //return success/not success

	public boolean executeUpdate(boolean status); //return true/false

}
