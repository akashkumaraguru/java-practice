import java.lang.Character.Subset;
import java.util.Scanner;

public class subtr {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String wd=s.nextLine();
        int st=s.nextInt();
        int ed=s.nextInt();
        System.out.println(wd.substring(st, ed));
    }
}
