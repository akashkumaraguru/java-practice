import java.util.Scanner;


public class parameter {
    public static void main(String[] args) {
        Scanner ak=new Scanner(System.in);
        System.out.print( "enter a your length : ");
        int length =ak.nextInt();
        System.out.print("enter your width : ");
        int width=ak.nextInt();
        System.out.print(" area : "+(length*width));
        System.out.print(" parameter "+(2*(length+width)));
        
    }

    
   
}
