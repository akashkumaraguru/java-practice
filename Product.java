import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int a=sca.nextInt();
        int b=sca.nextInt();
        int c=sca.nextInt();
        if(a>b && b<c){
            System.out.println(a+b+c);
        }
        else if (a<b &&b<c) {
            System.out.println(a-b-c);
        }
        else if (a>b && b>c) {
            System.out.println(a*b*c);
        } else if (a<b && b>c) {
            System.out.println(a / b / c);
        }
        else{
            System.out.println("invalid number");
        }
    }
}
