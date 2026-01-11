
import java.util.Scanner;

public class Ques2 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter The Radius of a Circle = ");
        double Radius = scanner.nextDouble();
        double Area = Math.PI * Radius * Radius;
        double Circumference = 2 * Math.PI * Area * Radius;
        System.out.println("Area of The Circle = " + Area);
        System.out.println("Circumference of the Circle = " + Circumference);
        scanner.close();  

 
    }
   }

