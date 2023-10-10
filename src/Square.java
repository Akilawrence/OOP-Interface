public class Square extends Shapes {

    private double side;

    public Square (double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side * side);
    }
    
    @Override
    public double getPerimeter() {
        return (4 * side);

    }       

}    
