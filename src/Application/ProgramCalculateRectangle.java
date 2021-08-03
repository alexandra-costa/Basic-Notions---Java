package Application;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;
public class ProgramCalculateRectangle {
    public static void main (String [] args){
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       Rectangle rectangle = new Rectangle();

       System.out.print("Enter Rectangle width and height: ");
       rectangle.width = sc.nextDouble();
       rectangle.height = sc.nextDouble();

       double areaRectangle = rectangle.area();
       double perimeterRectangle = rectangle.perimeter();
       double diagonalRectangle = rectangle.diagonal();

       System.out.printf("AREA: %.2f \n\n", areaRectangle);
       System.out.printf("PERIMETER: %.2f \n\n", perimeterRectangle);
       System.out.printf("DIAGONAL: %.2f \n\n", diagonalRectangle);

        sc.close();
    }
}
