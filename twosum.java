import java.util.Scanner;
public class twosum{
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.print("enter your numbr: !");
        int a=sca.nextInt();
        int num=a,sum=0,rem,temp;
        temp=num;
        while(num>0){
            rem=num%10;
            int fact=1;
            for(int i=1;i<rem;i++){
                fact=fact*i;
            }
            num=num/10;
            sum=sum+fact;
        }
        if(temp==sum){
            System.out.println("number is strong :");
        } 
        else{
            System.out.println("number is not a strong number");
        }

    }

}
