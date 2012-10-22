/**
 * Hello is a class that greets people.
 * 
 * @author dr
 * @since 1.0
 */
public class Hello {

	/**
	 * The main method of the program, which is invoked by the JVM when you run
	 * "java Hello".
	 * 
	 * @param args
	 *            The program's command-line arguments
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Hello, World");
		} else {
			for (String person : args) {
				System.out.println("Hello, " + person);
			}
		}
	}

}
