package week05;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		spacedMethod(log);
	}

	@Override
	public void error(String error) {
		System.out.print("ERROR: "); 
		spacedMethod(error);
	}
	
	/**
	 * Creates Spaces between characters in a String input
	 * @param input String
	 */
	public void spacedMethod(String input) {
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			output.append(input.charAt(i));
			if (i < input.length() - 1) {
				output.append(" ");
			}
		}
		System.out.println(output);
	}

} // End SpacedLogger Class
