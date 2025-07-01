package JavaInheritence.HierarchicalInheritence;
import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}

class Staff extends Person {
    String position;

    Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    void displayRole() {
        System.out.println(name + " is a Staff member as " + position);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Ram", 40, "Math");
        Student s = new Student("Riya", 16, "10th");
        Staff st = new Staff("Anjali", 35, "Clerk");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}