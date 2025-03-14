package az.edu.turing.exception;

public class NotFoundException extends Exception {

    public NotFoundException(String message) {

        super(message);
    }

    public NotFoundException() {
        super("Entity not found");  // Default message
    }
}
