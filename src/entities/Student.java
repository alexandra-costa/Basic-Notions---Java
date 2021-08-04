package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double sumGrades(){
        return grade1 + grade2 + grade3;
    }
    public double missingPoints(){
        return 60 - sumGrades();
    }

    public String toString(){
        return name
                + "\n Grade 1: "
                + grade1
                + "\n Grade 2: "
                + grade2
                + "\n Grade 3: "
                + grade3
                +"\n Final Student Grade: "
                + String.format("%.2f", sumGrades());
    }
}
