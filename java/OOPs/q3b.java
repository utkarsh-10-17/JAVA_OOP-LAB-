public class q3b {
    public static void main(String[] args) {
        String str = "Hello, World!";

       
        int length = str.length();

       
        String substring = str.substring(0, 5);

      
        String replacedString = str.replaceAll("!", ".");

       
        String uppercaseString = str.toUpperCase();

        String lowercaseString = str.toLowerCase();

        boolean contains = str.contains("World!");

        String[] splitString = str.split(",");

        System.out.println("Length: " + length);
        System.out.println("Substring: " + substring);
        System.out.println("Replaced string: " + replacedString);
        System.out.println("Uppercase string: " + uppercaseString);
        System.out.println("Lowercase string: " + lowercaseString);
        System.out.println("Contains: " + contains);
        System.out.println("Split string: ");
        for (String s : splitString) {
            System.out.println(s);
        }
    }
}
