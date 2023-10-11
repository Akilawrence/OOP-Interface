public class TestApp {
    
    public void testThis(ShapeInterface shape){
        System.out.println(shape);
        System.out.print(shape.getPerimeter() + " ");
        System.out.print(shape.getClass().getName() + " ");
         System.out.println("Has a area of " +shape.getArea() + " ");
        System.out.println();
    }

    public void testAdmin(AdminInterface shape){
        testThis(shape);
         System.out.print(shape.isFilled() ? " is filled " : " is not filled ");
        System.out.println(shape.AdminName());
    }
}
