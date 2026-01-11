import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the discounted Selling price:");
        double discountedSellingPrice = scanner.nextDouble();
        System.out.println("Enter the Discounted Percentage:");
        double discountPercentage = scanner.nextDouble();
        double originalPrice = discountedSellingPrice / (1 - discountPercentage / 100);
        System.out.println("The original price is: " + originalPrice);
        scanner.close();
    }
}