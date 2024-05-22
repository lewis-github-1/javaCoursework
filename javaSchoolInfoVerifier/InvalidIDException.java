public class InvalidIDException extends Exception {
    public InvalidIDException() {
        super("Error - Invalid ID Number: ");
    }

    public InvalidIDException(int id) {
        super("Error - Invalid ID Number: " + id);
    }
}

