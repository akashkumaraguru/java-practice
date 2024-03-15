class Circle {
    double x, y, r;
    double circumference() {
        return 2 * 3.14159;
    }
    double area() {
        return (22 / 7) * r * r;
    }
}
    class Box {
        double width;
        double height;
        double depth;
        double area() {
            double a = (width * height + height * depth + width * depth) * 2;
            return a;
        }
        double volume() {
            double v;
            v = width * height * depth;
            return v;

        }
    }

public class area {
    public static void main(String[] args) {
        Circle c = new Circle();
        Box d = new Box();
        c.x=12.3; 
        c.y = 11.31;
        c.r = 213.243;
        d.width = 123.12;
        d.height = 131.312;
        d.depth = 12.2;
        System.out.println("circum "+ c.circumference());
        System.out.println("area : "+ c.area());
        System.out.println("width : "+ d.area());
        System.out.println("volume : "+ d.volume());
    }
}
