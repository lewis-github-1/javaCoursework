class Main {
  public static void main(String[] args) {
		// These 2 lines clear the terminal between runs:
		System.out.print("\033[H\033[2J");
		System.out.flush();

		out("\n\nWorking with Strings\n=========================");
		
		String str = "CSCI-203 Advanced Java";

		// working with indexes
		out(str.indexOf("Advanced"));
		out(str.indexOf('Z'));
		out(str.substring(9, 13));

		// convert string to char array
		char letters[] = str.toCharArray();
		int digits = 0;
		int lowers = 0;
		int uppers = 0;
		int others = 0;

		// loop through the character array count character types
		out("\nIterating through the Character Array");
		out("======================================");
		for (char letter:letters) {
			if(isDigit(letter)) {digits++;}
			if(isLower(letter)) {lowers++;}
			if(isUpper(letter)) {uppers++;}
			if(isOther(letter)) {others++;}
		}
		out("Digits:\t" + digits);
		out("Uppers:\t" + uppers);
		out("Lowers:\t" + lowers);
		out("Others:\t" + others);


		out("\nUsing the replace() method:");
		out("===================================");
		String str2 = "messy";
		out("Original string: " + str2);
		str2 = str2.replace('e', 'i');
		out("New string: " + str2);


		out("\nUsing the toLowerCase() method:");
		out("===================================");
		out("Original:\t" + str);
		out("toLowerCase():\t" + str.toLowerCase());
		out("Variable is\t" + str);
		out("\n");

	}

	// Static methods are used because they are inside the Main
	// which means they don't belong to an instanced of an object
	
	public static void out(Object str){
		System.out.println(str);
	}
	
	public static boolean isUpper(char c) {
		return Character.isUpperCase(c);
	}

	public static boolean isLower(char c) {
		return Character.isLowerCase(c);
	}

	public static boolean isDigit(char c) {
		return Character.isDigit(c);
	}

	public static boolean isOther(char c) {
		return !isLower(c) && !isUpper(c) && !isDigit(c);
	}

}
