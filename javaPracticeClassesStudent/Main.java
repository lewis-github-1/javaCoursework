class Main {
  public static void main(String[] args) {
		// Task 1:  Create a student with no parameters
    Student stu1 = new Student();
		// Task 2:  Create a student with just a first and last name
    Student stu2 = new Student("John", "Doe");
		// Task 3:  Create a student with all parameters except GPA
    Student stu3 = new Student("Tom", "Sawyer", "Networking");
		// Task 4:  Create a student with all 4 paramters
    Student stu4 = new Student("Steve", "Jobs", 3.2, "Computer Science");
		// Task 5:  Display each instance (should be 4 instances)
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		System.out.println(stu4);

    
  }
}