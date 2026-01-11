import java.util.Scanner;
public class Ques8{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The side 'a' of Triangle");
        Double a = scanner.nextDouble();
        System.out.println("Enter The side 'b' of Triangle");
        Double b = scanner.nextDouble();
        System.out.println("Enter The side 'c' of Triangle");
        Double c = scanner.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt( s * (s-a) * (s-b) * (s-c));
        System.out.println("The Area of The Triangle is ;" +area + " square units.");
          
    }
}