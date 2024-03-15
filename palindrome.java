public class palindrome {
    public static void main(String[] args) {
        String firstWord = "malayalam";
        String secondWord = "";
        for (int i =0;i<firstWord.length();i++) {
            secondWord = firstWord.charAt(i) + secondWord;
        }
          if (firstWord.equals(secondWord)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }

    }

}
