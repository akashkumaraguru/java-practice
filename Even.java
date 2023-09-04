import java.sql.SQLOutput;
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner a= new Scanner((System.in));
        System.out.println("enter a number : ");
        int sel1=a.nextInt();
        int sel2=a.nextInt();
        for(int i=sel1;i<=sel2;i++){
            if( i%2==0) {
                System.out.println("even"+" "+ i);
            }
            else{
                System.out.println("add"+ " " +i);
            }
            }

        }

    }

