package org.cts.test.login;

public class TryCatchFinally {
private void sample() {
	String s = "sravani";
	String s1 = "sravani";
	if (!s.equals(s1)) {
		System.out.println("starts");
	} else {
		try {
			throw new UserDefException();
		} catch (UserDefException  e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("done");
		}
	}


}
public static void main(String[] args) {
	TryCatchFinally t = new TryCatchFinally();
	t.sample();
}
}
