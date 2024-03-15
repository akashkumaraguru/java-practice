class rev {
    //correct solution
    public static void main(String[] args) {
        int number = 987654, reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("number is : "+ reverse);
    }
}

// my solution
/* import java.util.Scanner; */
/* class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String reverse = "";
        for (int i = 0; i < x.length(); i++) {

            reverse = x.charAt(i) + reverse;

        }

        System.out.print(Integer.parseInt(reverse) + 1);

    }

} */