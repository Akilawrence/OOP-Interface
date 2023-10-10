public class App {
    public static void main(String[] args) throws Exception {
        TestApp test = new TestApp();

        Circle circle1 = new Circle(2, "Blue", true);
        Circle circle2 = new Circle(1, "Red", false);
        test.testThis(circle2);
        test.testAdmin(circle1);

        Square square1 = new Square(3, "Orange", false);
        Square square2 = new Square(2, "White", true);
         test.testThis(square1);
         test.testAdmin(square2);

        Rectangle rectangle1 = new Rectangle(4, 5, "Black", false);
        Rectangle rectangle2 = new Rectangle(1, 5, "White", false);
        test.testThis(rectangle1);
        test.testAdmin(rectangle2); 

    }
}
