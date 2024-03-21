import java.util.Scanner;

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
