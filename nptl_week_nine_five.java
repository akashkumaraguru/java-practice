
/*Complete the code below with a catch statement to print the following if the denominator (b) is zero

§ Cannot Divide by ZERO */
import java.util.Scanner;

public class nptl_week_nine_five {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int result;
        int a = input.nextInt();
        int b = input.nextInt();

        try{
            result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by Zero");
        }
    }

}