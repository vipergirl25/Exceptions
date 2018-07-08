package _02_gotta_catchem_all;

public class ExceptionMethods {
	double one;
	double two;
	String string;
	double divide(double one, double two) throws IllegalArgumentException {
		if(two==0.0) {
			throw new IllegalArgumentException();
		}else {
			return one/two;
		}
	}
	String reverseString(String string) throws IllegalStateException {
		if(string.equals("")) {
			throw new IllegalStateException();
		}else {
			String tstring = "";
			for (int i = string.length()-1; i > -1; i--) {
				System.out.println(tstring);
				tstring+=string.charAt(i);
			}
			string = tstring;
			return string;
		}
		
	}
}
