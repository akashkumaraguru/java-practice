import java.util.*;
public class fibo {
    int n;
    int fiboncai(int n) {
        if (n == 0) {
            return 0;

        }
        else if(n==1){
            return 1;
        }
        else{
            return(fiboncai(n-1)+fiboncai(n-2));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibo x =new fibo();
        x.n =sc.nextInt();
        for(int i = 0 ;i<=x.n;i++){
            System.out.print(x.fiboncai(i)+" ");
        }
        
    }

}
