
import java.util.Scanner;

public class For {
    public static void main(String args[]){
        System.out.println("enter a number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int sum=0;
        for(int i=0;i<a;i++){
            sum=sum+i;
            System.out.println( sum);

        }
    }

}

 
