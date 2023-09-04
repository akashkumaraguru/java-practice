import java.util.Scanner;
public class Num {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter your numbr: !");
        int a=sca.nextInt();
        int num=0,sum=0,rem,temp;
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
            System.out.println(sum+"number is strong :");
        }
        else{
            System.out.println(sum+ "number is not a strong number");
        }

    }

}
