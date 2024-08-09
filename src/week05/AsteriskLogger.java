package week05;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println(createThings("*", 3) + log + createThings("*", 3));
	}

	@Override
	public void error(String error) {
		System.out.println(createThings("*", 13 + error.length()));
		System.out.println(createThings("*", 3) + "Error: " + error + createThings("*", 3));
		System.out.println(createThings("*", 13 + error.length()));
		
	}
	
	/**
	 * This makes a String of a given character, Integer number of times
	 * @param take String 
	 * @param number Integer 
	 * @return
	 */
	public String createThings(String takeIn, int number) {
		String takeOut = "";
		for (int i = 0; i < number; i++) {
			takeOut += takeIn;
		}
		return takeOut;
	}

}
