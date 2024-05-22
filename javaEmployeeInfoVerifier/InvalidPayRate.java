public class InvalidPayRate extends Exception {

    public InvalidPayRate() {
        super("ERROR: Negative pay rate. ");
    }
}
