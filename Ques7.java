import java.util.Scanner;

public class  Ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter an Integer Number");
        int number = scanner.nextInt();
        if (number % 2 == 0 ) {
            System.out.println("Even" );
         } else {
           System.out.println("Odd" );
        }
        scanner.close();
    }
}