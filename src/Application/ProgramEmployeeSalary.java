package Application;
import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class ProgramEmployeeSalary {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Name: \n");
        emp.name = sc.nextLine();

        System.out.println();
        System.out.print("GrossSalary: \n");
        emp.grossSalary = sc.nextDouble();

        System.out.println();
        System.out.print("Tax: \n");
        emp.tax = sc.nextDouble();

        System.out.println();
        double netSalary = emp.netSalary();
        System.out.println("Employee: " + emp);

        System.out.println();
        System.out.print("Wich percentage to increase salary?");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + emp);







        sc.close();
    }
}
