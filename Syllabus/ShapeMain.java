/* 
        * Author : JEC21AD041 SACHIN RAJ M  
        * Date : 27/10/2022 Thursday
        * Program No : #16
        * Aim:  Java program to create an abstract class named Shape that contains an empty method 
                named numberOfSides( ). Provide three classes named Rectangle, Triangle and Hexagon such that 
                each one of the classes extends the class Shape. Each one of the classes contains only 
                the method numberOfSides( ) that shows the number of sides in the given geometrical structures.
        
    */


    import java.util.Scanner;
    abstract class Shape{
        abstract  void numberOfSides();
    }

    class Rectangle extends Shape{
        void numberOfSides(){
            System.out.println("Number of Sides of Rectangle: 4");
        }
    }
    class Triangle extends Shape{
        void numberOfSides(){
            System.out.println("Number of Sides of Triangle: 3");
        }
    }
    class Hexagon extends Shape{
        void numberOfSides(){
            System.out.println("Number of Sides of Hexagon: 6.");
        }
    }

    public class ShapeMain{
        public static void main(String[] args) {
            Rectangle r = new Rectangle();
            Triangle t = new Triangle();
            Hexagon h = new Hexagon();

            //calling functions
            r.numberOfSides();
            t.numberOfSides();
            h.numberOfSides();
        }
    }