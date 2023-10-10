public class Circle extends Shapes {

    private double radius;

    public Circle (double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return (Math.PI * (radius * radius)); 
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * radius);  
    }

    @Override
    public String toString(){
        return " Class " + getClass().getName() +" has color " + getColor();
    }
}
