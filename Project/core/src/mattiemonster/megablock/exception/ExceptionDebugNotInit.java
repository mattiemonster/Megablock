package mattiemonster.megablock.exception;

public class ExceptionDebugNotInit extends Exception {

	private static final long serialVersionUID = 1L;

	public ExceptionDebugNotInit() {
		super("You must initalise the debug messages first!");
	}

}
