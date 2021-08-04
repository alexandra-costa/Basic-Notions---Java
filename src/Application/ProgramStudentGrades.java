/*
Write a program wich reads the name and 3 grades (first maximum grade = 30; second and third maximum grade = 35) of a Student, prints out this name and grades,
do the sum of this grades and tells him if he passed or he failed (average grade is 60). If he fails, print out how many points are missing to him pass.
Create a class "Student" and solve this problem.

*/
package Application;
import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class ProgramStudentGrades {
    public static void main (String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Student std = new Student();

    System.out.print("Name: ");
    std.name = sc.nextLine();

    System.out.println();
    System.out.print("Grade 1: ");
    std.grade1 = sc.nextDouble();

    System.out.println();
    System.out.print("Grade 2: ");
    std.grade2 = sc.nextDouble();

    System.out.println();
    System.out.print("Grade 3: ");
    std.grade3 = sc.nextDouble();

    double sumGrades = std.sumGrades();
    System.out.println("Student:  " + std);

    if (sumGrades >= 60.0){
        System.out.println("PASSED! CONGRATS!");
    }
    else {
        System.out.printf("\n FAILED. \n MISSING %.2f POINTS.", std.missingPoints());
    }





        sc.close();
    }
}
