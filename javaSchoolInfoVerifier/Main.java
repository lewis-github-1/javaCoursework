
public class Main {

	public static void main(String[] args) {
    // These 2 lines clear the terminal between runs - leave the in your code:
    System.out.print("\033[H\033[2J");
    System.out.flush();

    // Code goes below here

		System.out.println("\n");
				
		
		try {
			Student stu1 = new Student("", 123, 3.5, 20);
			System.out.println("Student 1:");
			System.out.println(stu1);
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (InvalidIDException e) {
			System.out.println(e.getMessage());
		} catch (InvalidGPAException e) {
			System.out.println(e.getMessage());
		} catch (InvalidCreditHoursException e) {
			System.out.println(e.getMessage());
		}
		
		try{
			Student stu2 = new Student("John Doe", -5, 3.25, 20);
			System.out.println("\nStudent 2:");
			System.out.println(stu2);
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (InvalidIDException e) {
			System.out.println(e.getMessage());
		} catch (InvalidGPAException e) {
			System.out.println(e.getMessage());
		} catch (InvalidCreditHoursException e) {
			System.out.println(e.getMessage());
		}

		try{
			Student stu3 = new Student("Jane Doe", 456, 4.5, 20);
			System.out.println("\nStudent 3:");
			System.out.println(stu3);
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (InvalidIDException e) {
			System.out.println(e.getMessage());
		} catch (InvalidGPAException e) {
			System.out.println(e.getMessage());
		} catch (InvalidCreditHoursException e) {
			System.out.println(e.getMessage());
		}

		try{
			Student stu4 = new Student("Tom Sawyer", 789, 3.5, -5);
			System.out.println("\nStudent 4:");
			System.out.println(stu4);
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (InvalidIDException e) {
			System.out.println(e.getMessage());
		} catch (InvalidGPAException e) {
			System.out.println(e.getMessage());
		} catch (InvalidCreditHoursException e) {
			System.out.println(e.getMessage());
		}

		try{
			Student stu5 = new Student("Huck Finn", 901, 3.75, 12);
			System.out.println("\nStudent 5:");
			System.out.println(stu5);
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (InvalidIDException e) {
			System.out.println(e.getMessage());
		} catch (InvalidGPAException e) {
			System.out.println(e.getMessage());
		} catch (InvalidCreditHoursException e) {
			System.out.println(e.getMessage());
		}

		
	}
}
