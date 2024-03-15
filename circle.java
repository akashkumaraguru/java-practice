 class find {
    double x,y,r;

    double circumference(){
        return 2*3.14159*r;
    }
    double area(){
        return (22/7)*r*r;
    }
    
}
public class circle  {
    public static void main(String[] args) {
        find c = new find();
        c.x = 0.2;
        c.r = 2.23;
        c.y = 32.3;
        System.out.println("circum of" + c.circumference());
        System.out.println("Area"+c.area());
        
    }

    
}
