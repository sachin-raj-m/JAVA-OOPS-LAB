/* 
        * Author : JEC21AD041 SACHIN RAJ M  
        * Date : 27/10/2022 Thursday
        * Program No : #17
        * Aim:  Create a class Box with instance variables length, width, and height. Include a method volume 
                to compute the volume of the box. Create another class BoxDemo with the main function that 
                creates an object of class Box named mybox1 and set the values for instance variables
                (length, width, and height). Invoke the function volume in Box to compute the volume of the 
                created object mybox1.
        
*/

class Box{
    int length,breadth,height;

    void volume(int l,int b,int h){
        System.out.println("The volume of the box = "+(l*b*h)+"cm^3.");
    }
}

public class BoxDemo{
    public static void main(String[] args) {
        
        Box mybox1 = new Box();
        mybox1.volume(10,20,30);
    }
}