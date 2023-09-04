import java.util.Scanner;

public class Form {
    int a,b;
    Scanner s2;

 public void func(Scanner s1){
     s1=s2;
     System.out.println("enter a number");
     a=s1.nextInt();
     System.out.println("enter a second number");
     b=s1.nextInt();
 }
 void condi(){
     if(a>b){
         System.out.println("a is greater than b");
     }
     else if (b>b) {
         System.out.println("b is greater than a");

     } else{
         System.out.println("both are equal");
     }

 }

    public static void main(String[] args) {
        Form cond=new Form();

    }

 }


