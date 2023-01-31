public class Circle {
    private double radius;
    private String color;


    public String getColor(){
        return color;
    }

    public double getRadius(){
        return radius;
    }

    //default Constructor
    public Circle(){
        this.color = "Green";
        this.radius = 2;
    }

    //Second Overloading Constructor
    public Circle(int radius){
        this.radius = radius;
        this.color = "Blue";
    }

    //Third Constructor
    public Circle(int radius, String color){
        this.color = color;
        this.radius = radius;
    }
// calculate area
    public double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }
// toString method
    public String toString(){
        return "Color: "+color+"\n"+"Radius: "+radius;
    }












}
