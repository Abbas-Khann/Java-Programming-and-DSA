// Finding the area of Isosceles Triangle


import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base ");
        float base = sc.nextFloat();
        System.out.print("Enter the height ");
        float height = sc.nextFloat();
        float area;
        area = base * height /2;
        System.out.print("The area of Isosceles Triangle is "+ area);
    }
}
