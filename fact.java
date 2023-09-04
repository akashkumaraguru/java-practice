import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        System.out.print("enter a number : ");
        Scanner sec=new Scanner(System.in);
        int a=sec.nextInt();
        int c=0,d=1,sum=0;
        while(a>0){
            c=a%10;
        for(int i=0;i<c;i++){
            for(int j=0;j<i;j++){
                   d=d*i;
            }
             sum=sum+d;
             a=a/10;
            }
         }
        if(sum==a){
            System.out.println("strong number");

        }
        else{
            System.out.println(" not a strong number");
        }
        
    }
   
    }

            


        
        

        