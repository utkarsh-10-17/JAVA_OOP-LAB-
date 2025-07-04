public class q1b {
    public static void main(String[] args) {
       
        int x = 10;
        long y = x;
        float z = x;
        double d = x;

   
        double d1 = 123.456;
        float f1 = (float) d1;
        long l1 = (long) f1;
        int i1 = (int) l1;


        System.out.println("Widening type casting:");
        System.out.println(x + " " + y + " " + z + " " + d);

        System.out.println("\nNarrowing type casting:");
        System.out.println(d1 + " " + f1 + " " + l1 + " " + i1);
    }
}
