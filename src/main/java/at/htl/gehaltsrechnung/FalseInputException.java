package at.htl.gehaltsrechnung;

public class FalseInputException extends RuntimeException {
    public FalseInputException() {
    }
    public FalseInputException(String message) {
        super(message);
    }
}
