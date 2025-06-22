class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayGrade() {
        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 60) grade = 'C';
        else if (marks >= 40) grade = 'D';
        else grade = 'F';

        System.out.println(name + "'s Grade: " + grade);
    }
}

public class GradeManager {
    public static void main(String[] args) {
        Student s1 = new Student("Abi", 85);
        s1.displayGrade();
    }
}
