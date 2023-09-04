import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter a name : ");
        System.out.println("enter a department : ");
        System.out.println("enter your fees : ");
        int numid=sca.nextInt();
        String dep=sca.next();
        int fee=sca.nextInt();
        if (numid == 1) {
            System.out.println("akash");
        } else if (numid == 2) {
            System.out.println("naveen");
        } else if (numid == 3) {
            System.out.println("karthik");
        } else if (numid == 4) {
            System.out.println("rohit");
        } else {
            System.out.println("enter a correct id");
            if (dep.equals("IT")) {
                System.out.println(numid + "he's IT department");
            } else if (dep.equals("CSE")) {
                System.out.println(numid + "he's CSE department");
            } else if (dep.equals("ECE")) {
                System.out.println(numid + "he's ECE department");
            } else {
                System.out.println("enter a correct department");
                if (fee == 10000) {
                    System.out.println("he's hosteller");
                } else if (fee == 5000) {
                    System.out.println("he's a dayschollar");
                } else {
                    System.out.println("enter a correct amount");
                }
            }
        }

    }
}
