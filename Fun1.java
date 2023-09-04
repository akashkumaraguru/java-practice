import java.util.Scanner;

public class Fun1 {
    public static void main(String[] args) {
        System.out.print("enter a first number : ");
        Scanner ent=new Scanner(System.in);
        int a=ent.nextInt();
        System.out.print("enter a second number: ");
        int b=ent.nextInt();
        System.out.println("enter your third number : ");
        int c=ent.nextInt();
        func(a,b,c);
    }
    public static void func(int a, int b,int c) {
         if(a>b){

             System.out.print(a+c);
        }
        else if(a==b){
            System.out.println(c+a);
        }
        else{
            System.out.println(b+c);
        }
    }
        
    }
