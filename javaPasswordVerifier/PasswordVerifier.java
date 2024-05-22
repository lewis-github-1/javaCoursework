public class PasswordVerifier {
    public static boolean isValid(String password){
        boolean hasUpperCaseLetter = hasUpperCase(password);
        boolean hasLowerCaseLetter = hasLowerCase(password);
        boolean hasDigit = hasDigit(password);
        boolean hasMinimumLength = hasLength(password);

        if (hasUpperCaseLetter && hasLowerCaseLetter && hasDigit && hasMinimumLength) {
            System.out.println("Valid password");   
            return true;
        } else {
            System.out.println("\nPassword not valid for the following reasons:");
            if (!hasUpperCase(password)){
                System.out.println("- Missing an uppercase letter");
            }
            if (!hasLowerCase(password)){
                System.out.println("- Missing a lowercase letter");
            }
            if (!hasDigit(password)){
                System.out.println("- Missing a digit");
            }
            if (!hasLength(password)){
                System.out.println("- Not long enough");
            }
            }
            return false;
    };
    private static boolean hasUpperCase(String password){
        for (char ch: password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    };
    private static boolean hasLowerCase(String password){
        for (char ch: password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                return true;
            }
        }
        return false;
    };
    private static boolean hasDigit(String password){
        for (char ch: password.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    };
    private static boolean hasLength(String password){
        if ((password.length() >= 6)) {
            return true;
        } else {
            return false;
        }
    };
	
}
