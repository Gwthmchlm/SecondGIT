package org.cts.test.login;

public class UserDefException extends Exception {
@Override
public String getMessage() {
	String m = "it is user defined exception";
	return m;	
}
}
