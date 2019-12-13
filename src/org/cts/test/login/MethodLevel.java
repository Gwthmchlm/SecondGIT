package org.cts.test.login;

public class MethodLevel {
public void xam() throws UserDefException {
	throw new UserDefException();
}
public static void main(String[] args) throws UserDefException {
	MethodLevel s = new MethodLevel();
	s.xam();
}
}
