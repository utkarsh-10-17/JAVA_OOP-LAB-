import java.util.Scanner;

public class q1a {
    public static void main(String[] args) {
        double sum = 0.0;
        int count = 0;


        for (String arg : args) {
            sum += Double.parseDouble(arg);
            count++;
        }

    
        double average = sum / count;

    
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}