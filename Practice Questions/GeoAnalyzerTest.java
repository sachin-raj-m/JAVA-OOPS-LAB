interface GeoAnalyzer{
    
    public static final float pi = 3.124F;
    float area();
    float perimeter();
    
}


 class Circle implements GeoAnalyzer{
    
    float radius;
    public Circle(float r){
        radius = r;
    }
    
    public float area(){
        return (pi*radius*radius);
    }
    
    public float perimeter(){
        return (2*pi*radius);
    }
    
}

 class Ellipse implements GeoAnalyzer{
    
    
    int a,b;
    public Ellipse(int a, int b){
        this.a = a;
        this.b = b;
    }
    public float area(){
        return (a+b);
    }
    
    
    public float perimeter(){
        return (pi*(a+b));
    }
    
}

 class Rectangle implements GeoAnalyzer{
    
    int l,b;
    public Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    
    public float area(){
        return (l*b);
    }
    
    
    public float perimeter(){
        return (2*(l+b));
    }
    
}


public class GeoAnalyzerTest{
    public static void main(String args[]){
        
        
        Circle c = new Circle(3);
        Ellipse e = new Ellipse(3,7);
        Rectangle r = new Rectangle(5,6);
        
        System.out.println("Area of Circle = "+c.area());
        System.out.println("Perimeter of Circle = "+c.perimeter());
        
        System.out.println("Area of Ellipse = "+e.area());
        System.out.println("Perimeter of Ellipse = "+e.perimeter());
        
        System.out.println("Area of Rectangle = "+r.area());
        System.out.println("Perimeter of Rectangle = "+r.perimeter());
    }
}