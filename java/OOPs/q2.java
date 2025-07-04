import java.util.*;
class Rectangle {
    public int length;
    public int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return this.length * this.breadth;
    }

    public int getPerimeter() {
        return 2 * (this.length + this.breadth);
    }
}

class Box extends Rectangle {
    public int height;

    public Box(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

 
    public int getArea() {
      
        return 2 * (this.length * this.breadth + this.breadth * this.height + this.length * this.height);
    }

 
    public int getPerimeter() {
       
        return 4 * (this.length + this.breadth + this.height);
    }
}

public class q2 {
    public static void main(String[] args) {
      
        Rectangle rectangle = new Rectangle(10, 5);

       
        int area = rectangle.getArea();
        int perimeter = rectangle.getPerimeter();

   
        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);


        Box box = new Box(10, 5, 10);

      
        int surfaceArea = box.getArea();
        int boxPerimeter = box.getPerimeter();

   
        System.out.println("Surface area of box: " + surfaceArea);
        System.out.println("Perimeter of box: " + boxPerimeter);
    }
}
