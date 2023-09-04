import java.util.Scanner;
public class Arraypractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int first[]=new int[a];
        for(int i=0;i<first.length-1;i++){
             first[i]=sc.nextInt();
        }
        for(int j=0;j<=first.length-1;j++){
            System.out.println(first[j]);
        }




    }
}
