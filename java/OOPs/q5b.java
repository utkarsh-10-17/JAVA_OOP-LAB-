public class q5b {
    public static void main(String[] args) {
        try {
        
            try {
                
                int a = 10;
                int b = 0;
                int c = a / b; 
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException in inner try block: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Exception in outer try block: " + e.getMessage());
        }
    }
}
