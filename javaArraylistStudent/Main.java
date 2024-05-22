class Main {
  public static void main(String[] args) {
    Student student1 = new Student("John", "Doe", 90);
    Student student2 = new Student("Jane", "Doe", 85);
    Student student3 = new Student("Santa", "Clause", 93);

    Grades class1 = new Grades();

    class1.addStudent(student1);
    class1.addStudent(student2);
    class1.addStudent(student3);

    System.out.println("\n");
    
    System.out.println("The expected highest grade should be 93");
    System.out.printf("The actual highest grade is: %.0f", class1.getMaximumGrade());
    System.out.println("\n");

    System.out.println("The expected lowest grade should be 85");
    System.out.printf("The actual lowest grade is: %.0f", class1.getMinimumGrade());
    System.out.println("\n");

    System.out.println("The expected average grade should be 89.33");
    System.out.printf("The actual average grade is: %.2f", class1.getAverageGrade());
    System.out.println("\n");

    System.out.println(class1.toString());


    
  }
}