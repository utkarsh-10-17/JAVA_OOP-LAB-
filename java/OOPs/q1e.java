import java.util.Scanner;

public class q1e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter the principal amount: ");
        float principal = scanner.nextFloat();

        System.out.println("Enter the rate of interest: ");
        float rate = scanner.nextFloat();

       
        System.out.println("Enter the time period in years: ");
        int time = scanner.nextInt();

        float simpleInterest = (principal * rate * time) / 100;

        
        System.out.println("The simple interest is: " + simpleInterest);
    }
}
