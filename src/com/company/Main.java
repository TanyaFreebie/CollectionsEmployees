package com.company;



import com.company.company.Company;
import com.company.company.Employee;
import com.company.students.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


//        List <Employee> googleEmployees = new ArrayList<>();
//        googleEmployees.add(new Employee("George", 35, "J12", "Microsoft"));
//        googleEmployees.add(new Employee("Dana", 29, "H15", "Microsoft"));
//        googleEmployees.add(new Employee("Harry", 28, "U23", "Microsoft"));
//
//
//        List<Employee> microsoftEmployees = new ArrayList<>();
//        microsoftEmployees.add(new Employee("Nathan", 31, "I91", "Google"));
//        microsoftEmployees.add(new Employee("Jane", 42, "A22", "Google"));
//        microsoftEmployees.add(new Employee("Jordan", 22, "O23", "Google"));
//
//
//
//        Company microsoft = new Company("Microsoft", microsoftEmployees );
//        Company google = new Company("Google",  googleEmployees);
//
//        System.out.println("The average age of employees in Microsoft is " + microsoft.getAverage());
//        System.out.println("The average age of employees in Google is " + google.getAverage());

        //****Hard-coding
        List<Student> studentsList = new ArrayList<>();
//        studentsList.add(new Student("Dave",19, 40));
//        studentsList.add(new Student("Dave",19, 43));
//        studentsList.add(new Student("Dave",19, 55));
//        studentsList.add(new Student("Dave",19, 33));
//        studentsList.add(new Student("Dave",19, 22));
//        studentsList.add(new Student("Dave",19, 49));
//        studentsList.add(new Student("Dave",19, 29));
//        studentsList.add(new Student("Dave",19, 33));
//        studentsList.add(new Student("Dave",19, 21));
//        studentsList.add(new Student("Dave",19, 22));
//        studentsList.add(new Student("Dave",19, 56));
//        studentsList.add(new Student("Dave",19, 34));
//        studentsList.add(new Student("Dave",19, 12));
//        studentsList.add(new Student("Dave",19, 23));
//        studentsList.add(new Student("Dave",19, 22));
//        studentsList.add(new Student("Dave",19, 54));
//        studentsList.add(new Student("Dave",19, 56));
//        studentsList.add(new Student("Dave",19, 23));
//        studentsList.add(new Student("Dave",19, 34));
//        studentsList.add(new Student("Dave",19, 44));
        //user-interactive
        Scanner sc = new Scanner(System.in);

        //how many students he wants to add
        System.out.println("Add an number of students: ");
        int numberOfStudents = sc.nextInt();

        // populate the list of the students with user-input

        for(int i = 0; i < numberOfStudents; i++){
            //promt user for data
            System.out.println("Enter the  name of student: ");
            String name = sc.next();

            System.out.println("Enter the  age of student: ");
            int age = sc.nextInt();

            System.out.println("Enter the  score of student: ");
            int score = sc.nextInt();

            //add new student object to list
            studentsList.add(new Student(name, age, score));
        }

        System.out.println(studentsList.size());

        System.out.println("The maximum score of the students is: " +getBestStudent(studentsList).getScore() + " belonging to " + getBestStudent(studentsList).getName());
    }

    public static Student getBestStudent(List<Student> students){
        //define max variable
        Student bestStudent = students.get(0);

        for(Student student : students){
            if(bestStudent.getScore() < student.getScore()){
                bestStudent = student;
            }
        }//maximum score found  by teh time loop ends
        return bestStudent;

    }
}
