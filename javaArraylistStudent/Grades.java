import java.util.ArrayList;

public class Grades {
  private ArrayList<Student> students;

  public Grades() {
    this.students = new ArrayList<Student>();
  }

  public void addStudent(Student student) {
    if (student != null) {
      this.students.add(student);
    } else {
      System.out.println("Invalid");
    }
  }

  public double getMaximumGrade() {
    Student highestSoFar = this.students.get(0);
    
    for (Student i: this.students) {
      if (i.getGrade() > highestSoFar.getGrade()) {
        highestSoFar = i;
      }
    }
    return highestSoFar.getGrade();
  }

  public double getMinimumGrade() {
    Student lowestSoFar = this.students.get(0);

      for (Student i: this.students) {
        if (i.getGrade() < lowestSoFar.getGrade()) {
          lowestSoFar = i;
        }
      }
    return lowestSoFar.getGrade();
  }

  public double getAverageGrade() {
    double total = 0;
    int count = 0;
    for (Student i : this.students) {
    total = total + i.getGrade();
    count++;
    }
    return total / count;
  }
  

  public String toString() {
    String studentInfo = "";
    for (Student i : this.students) {
      studentInfo = studentInfo + i.toString() + "\n";
    }
    return studentInfo;
  }

	
}