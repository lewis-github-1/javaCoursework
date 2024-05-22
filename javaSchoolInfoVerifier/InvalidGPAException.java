public class InvalidGPAException extends Exception {
    public InvalidGPAException() {
        super("Error - Invalid GPA: ");
    }

    public InvalidGPAException(double gpa) {
        super("Error - Invalid GPA: " + gpa);
    }
}
