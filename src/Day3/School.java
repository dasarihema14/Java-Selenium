package Day3;
import java.util.Scanner;
class Person {
    String name;
    int age;
}

class Student extends Person {
    String course;

    void showStudent() {
    	
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

class Teacher extends Person {
    String subject;

    void showTeacher() {
    	
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class School {
    public static void main(String[] args) {
       /* Student s = new Student();
        s.name = "Rahul";
        s.age = 19;
        s.course = "Physics";
        s.showStudent();

        Teacher t = new Teacher();
        t.name = "Anita";
        t.age = 35;
        t.subject = "Math";
        t.showTeacher();*/
    	
    	//usercase
    	
    	 Scanner sc = new Scanner(System.in);

         Student s = new Student();
         System.out.println("Enter student name: ");
         s.name = sc.nextLine();
         System.out.println("Enter student age: ");
         s.age = sc.nextInt();
         sc.nextLine(); 
         System.out.println("Enter course: ");
         s.course = sc.nextLine();

         Teacher t = new Teacher();
         System.out.println("Enter teacher name: ");
         t.name = sc.nextLine();
         System.out.println("Enter teacher age: ");
         t.age = sc.nextInt();
         sc.nextLine();
         System.out.println("Enter subject: ");
         t.subject = sc.nextLine();

         System.out.println("\n--- Student Details ---");
         s.showStudent();

         System.out.println("\n--- Teacher Details ---");
         t.showTeacher();

         sc.close();
    }
}

