 public class Arr{
     public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 2, 3};
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr.length; ++i) {
                if (arr[i] == arr[j]) {
                    System.out.println("the duplicate number is" + arr[i]);
                }
            }
        }

    }

 }
