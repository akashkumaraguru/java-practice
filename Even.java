import java.sql.SQLOutput;
import java.util.Scanner;

class findEven {
    int num1;
    void func() {
        
            if (num1 % 2 == 0) {
               System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        

    }
}
public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findEven eve = new findEven();
        eve.num1 = sc.nextInt();
        eve.func();
    }

}
