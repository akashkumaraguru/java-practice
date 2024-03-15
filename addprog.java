
import java.util.Scanner;

class Numb {
    int c;
    int num1;
    int num2;

    int add() {
        return c = num1 + num2;

    }

}
public class addprog {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        Numb a = new Numb();
        a.num1 = b.nextInt();
        a.num2 = b.nextInt();
        System.out.println(a.add());

    }

}
