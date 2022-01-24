import java.util.Scanner;
import java.text.*;

public class Circumference_Area {
    public static double CF (int radius) {
        double Circumference = 2 * Math.PI * radius;               // Math.pow(2,radius);
        return Circumference;
    }
    public static double areaOfCircle (int radius) {
        double area = Math.PI * radius * radius;                           // Math.pow(2,radius);
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Enter the radius to find the area and circumference of a circle : ");
        int num = sc.nextInt(); // Number entered here would mean the radius
        double Cir = CF(num);
        double area = areaOfCircle(num);
        System.out.println("The circumference is : "+df.format(Cir));
        System.out.println("The area of is : "+df.format(area));
    }
}
