class Point{
    int x,y;
void setPoint(int a , int b){
    x=a;
    y=b;
}

}
public class Goodmethod {
    public static void main(String[] args) {
        Point a = new Point();
        a.setPoint(20, 50);
        System.out.println("Add is : "+ a.x);
        System.out.println("Add is : "+ a.y);
        
    }
}
