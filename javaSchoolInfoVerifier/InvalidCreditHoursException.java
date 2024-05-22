public class InvalidCreditHoursException extends Exception {
    public InvalidCreditHoursException() {
        super("Error - Invalid Credit Hours: as;dlkjasdf");
    }

    public InvalidCreditHoursException(int hours) {
        super("Error - Invalid Credit Hours: " + hours);
    }

}


    
    

