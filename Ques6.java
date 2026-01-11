import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Lenght Of parallel side (a):" );
        double a = scanner.nextDouble();

        System.out.print("Enter The Lenght Of parallel side (b):" );
         double b = scanner.nextDouble();

         System.out.print("Enter The Lenght Of parallel side (h):" );
        double h = scanner.nextDouble();

        double K = h * (a + b)/2;
        System.out.println("The Area Of Trapezoid Is:" + K + " square units");


    }
}