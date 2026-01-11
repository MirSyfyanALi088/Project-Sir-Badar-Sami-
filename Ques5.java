import java.util.Scanner;
public class Ques5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Value Of Voltage:" );
        double V = scanner.nextDouble();  
    
        System.out.println("Enter The Value Of Current");
        double A = scanner.nextDouble();     
        
        double p = V * A;

        System.out.println( "The Power Is; " + p + "Watts" );
        scanner.close();
    }
}
    
