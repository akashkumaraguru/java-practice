
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        if(a<0){
            System.out.println("the number is negative");
        }
        else{
            System.out.println("the number is postive");
        }
    }
}
