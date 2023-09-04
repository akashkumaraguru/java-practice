import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter a number : ");
        int num=inp.nextInt();
        for(int i=1;i<=num;i++){
            if(num %i !=0){
                System.out.println(num+"it's a prime number");

            }

        }

    }

}