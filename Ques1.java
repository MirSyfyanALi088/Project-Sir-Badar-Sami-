import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your Obtain Marks");
        double obtainmarks = scanner.nextDouble();
        System.out.println("Enter Your Total Marks");
        double totalmarks = scanner.nextDouble();
        
        double percentage;

        percentage = (obtainmarks /totalmarks) * 100;
        System.out.println("Your Percentage is:" + percentage + "%");
        scanner.close();    
    }
    
}
