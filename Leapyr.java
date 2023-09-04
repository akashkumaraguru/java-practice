import java.util.Scanner;

public class Leapyr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a year :  ");
        int inp=sc.nextInt();
        if(((inp%4==0) && (inp%100!=0)) || (inp%400==0)){
            System.out.println("it's a leap year");
        }
        else {
            System.out.println("it's not a leap year");
        }
    }
}
