import java.util.Scanner;

public class reverse {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        for(int i=a.length()-1;i>=0;i--){
           System.out.print(a.charAt(i));
            }
             for(int j=b.length()-1;j>=0;j--){
                  System.out.print(""+b.charAt(j));
            }
            
        }
    }
    
