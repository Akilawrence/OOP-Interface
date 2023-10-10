public class Rectangle extends Shapes {
    
    private double length;
    private double width;

    public Rectangle (double length, double width, String color, boolean filled){
        super(color,filled);
        this.length = length;
        this.width = length;

    }

    @Override
    public double getArea() {
        return (width * length);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }



}
