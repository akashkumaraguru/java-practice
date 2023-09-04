import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(i +"X" +inp +"="+ (inp*i));
        }
    }
}
