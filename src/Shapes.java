//import java.lang.reflect.Constructor;

public abstract class Shapes implements  AdminInterface  {
    
    protected String color;
    protected boolean filled;
    
    public Shapes(){
    }

    @Override
    public String AdminName(){
        return "John";

    }
    //Two constructor
    public Shapes(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }

    //Abstract Methods 
    
    @Override
    public abstract double getArea();
    
    @Override
    public abstract double getPerimeter();

    //Getters
    
    @Override
    public String getColor() {
        return color;
    }
    
    @Override
    public boolean isFilled() {
        return filled;
    }
    
    //To string method
    @Override
    public String toString(){
        return "The color of the shape is  " + color; 
    }

}
