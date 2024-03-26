import java.util.Scanner;

/*Complete the code segment to catch the exception in the following, if any.

On the occurrence of such an exception, your program should print

§ Please enter valid data

If there is no such exception, it will print the square of the number entered.

 */
public class nptl_weekeig_two {



    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();

        double result = 0.0;
        while (num > 0) {
            result = result + (double) 1 / num;
            num--;

        }

        System.out.println("Output of Harmonic series is " + result);
    }

}
