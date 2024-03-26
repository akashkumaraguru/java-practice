import java.util.Scanner;

public class nptl_week_nine {
    public static void main(String[] args){
        try{

            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            int x = Integer.parseInt(number);
            System.out.println(x*x);

        }
        catch(Exception e){
            System.out.println("Please Enter a valid data");
        }
        



    }

}
