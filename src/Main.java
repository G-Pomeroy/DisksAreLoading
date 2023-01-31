
public class Main {
    public static void main(String[] args) {
        // creation of first circle object

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(9,"Purple");

        System.out.println("Here is circle 1: ");
        System.out.println(circle1);

        //creation of second circle
        System.out.println("Here is circle 2: ");
        System.out.println(circle2);

        //circle of third circle with the use of the calculateArea method
        System.out.println("Here is circle 3: ");
        System.out.println(circle3.calculateArea(5));




    }
}