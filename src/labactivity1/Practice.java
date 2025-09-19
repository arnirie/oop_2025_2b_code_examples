package labactivity1;

public class Practice {

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.getArea());
        System.out.println(Circle.computeArea(5));
    }
}

class Circle{
    private double radius;

    public Circle(){
        radius = 0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){ this.radius = radius; }

    public double getRadius(){ return this.radius; }

    public double getDiameter(){ return this.radius * 2; }

    public double getArea(){ return Math.PI * Math.pow(radius, 2); }

    public static double computeArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
}

//create class Circle, with:
//field: radius, double)
//Circle()
//Circle(radius)
//getter & setter for radius
//getDiameter()
//getArea()
//static method computeArea(double radius) -> compute the area based on the
//radius

