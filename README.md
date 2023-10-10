# OOP Design
## Objective
Create class files that define/represent the specified shapes mentioned in the iterations. Build the application in a series of iterations, with each iteration being a functional (though incomplete) version of a final application.

###Skills Required
- Object Oriented Programming
- Abstraction
- Polymorphism
- Inheritance
- Encapsulation

###Iterations
Build the application in the following small iterations. **It should function at completion of each iteration!**

##Part 1

1. rite an abstract class called **Shape**, which contains:
    - Two protected access instance variables color (String) and filled (boolean).

    - Two constructors: 
      1. A no-arg (no-argument) constructor that initializes the color to "green" and filled to true,
      2. A constructor that initializes the color and filled to the given values.

    - Two abstract methods: 
      1. getArea()  
      2. getPerimeter()

    - Getters for all the instance variables. By convention, the getter for a boolean variable xxx is called isXXX() (instead of getXxx() for all the other types).

    - A toString() method that returns "A Shape with color of xxx and
filled/Not filled".

    - Prepare a test program that will test all the methods defined in Shape once you begin writing your Concrete child classes.

2. Write three subclasses of **Shape** called **Circle**, **Rectangle**, and **Square**.

**The Circle class contains:**

   - Instance variables associated with a Circle
   - Constructors that can take in various combinations of Circle's instance variables as parameter variables
   -  Getters for all instance variables.
Methods getArea() and getCircumference().
- An isCircle() method that returns true or false and uses the instance variables to determine if object would be a Circle
- Override the toString() method inherited, to return "A Circle with
radius=xxx, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.

Write a test program to test all the methods defined in Circle.

**The Rectangle class contains:**

- Instance variables associated with a Rectangle
- Constructors that can take in various combinations of Rectangle's instance variables as parameter variables
- Getters for all the instance variables.
- Methods getArea(), getPerimeter(), and getDiagonal().
- An isRectangle() method that returns true or false and uses the instance variables to determine if object would be a Rectangle
- Override the toString() method inherited, to return "A rectangle with width=xxx and length=zzz, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.

Write a test program to test all the methods defined in Rectangle.

Write a class called Square, as a subclass of Rectangle. Convince yourself that Square can be modeled as a subclass of Rectangle.

- Square has no instance variable, but inherits the instance variables from its superclass Rectangle.
- Provide the appropriate constructors (as shown in the class diagram).
- An isSquare() method that returns true or false and uses the instance variables to determine if object would be a Square
- Override the toString() method to return "A Square with side=xxx, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.
- Figure out if there is a need to override the getArea(), getPerimeter(), and getDiagonal()
  
Write a test program to test all the methods defined in Square.

##Part 2

- Refactor Shape class to be an interface
- Using the following chart, 
[Quadrilateral Family Tree] (http://2differentiate.pbworks.com/f/QuadrilateralFamilyTree.pdfLinks), refactor the Rectangle and Square classes so that it is created in its proper hierarchy of a Quadrilateral

1. Of the new classes, one specific one should be an abstract class that inherits from the new Shape interface
2. Create all needed constructors for each new class created
3. Override/include all appropriate method functions
4. Using the aforementioned tree, provide the appropriate instance variables for the newly created classes
5. Write a test program to test all the methods of the new refactored code
##Part 3

- Research Polygons. Refactor established code to include Polygons.

1. Of the new classes, one specific one should be an abstract class that inherits from the Shape interface
2. Create all needed constructors for each new class created
3. Override all appropriate method functions
4. For the Triangle, create classes for all types of triangles.
   - Create all needed constructors for each new class created
   - Override/include all appropriate method functions
   - Include all applicable instance variables
5. Write a test program to test all the methods of the new refactored code

*© We Can Code IT 2023*
 