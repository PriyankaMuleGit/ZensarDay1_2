package CollectionFramework;

public class InvalidName extends Exception {

	public InvalidName() {
		super("Invalid Name");
	}
	
	public InvalidName(String msg) {
		super(msg);
	}
	
}
