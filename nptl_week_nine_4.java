import java.util.Scanner;
/*
    * Define a class Point with members
    * 
    * § private double x;
    * 
    * § private double y;
    * 
    * and methods:
    * 
    * § public Point(double x, double y){} // Constructor to create a new point?
    * 
    * § public double distance(Point p2){} // Function to return the distance of
    * this Point from another Point
    */

public class nptl_week_nine_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x1,y1);
        System.out.print(p1.distance(p2));

    }

}
class Point{
    private double x;
    private double y;
    
    public Point (double x , double y){
        this.x = x;
        this.y=y;
    }
    public double distance(Point p2){
        double d;
        d = Math.sqrt((p2.x-x)*(p2.x-x)+(p2.y-y)*(p2.y-y));
        return d;
    }
}
