class Point{
    int x , y;
    void setpoint(){
        x=20;
        y=50;
    }

}
//initalize number in class
public class Setpnt{
   public static void main(String[] args){
    Point a =new Point();
    a.setpoint();
    System.err.println("X "+a.x);
    System.err.println("X "+a.y);
   }
    
}