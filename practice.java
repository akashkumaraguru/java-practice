import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        System.out.println(a.length()+b.length());
        if(a.charAt(0)<b.charAt(0)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");

        }
        System.out.println(Character.toUpperCase(a.charAt(0))+a.substring(1,a.length())+" " +Character.toUpperCase(b.charAt(0))+b.substring(1, b.length()));

    }
}
