 /* class Find {
    String name;
    double balance;

        Find (String n , double b){
        name = n;
        balance=b;

    }
    void show(){
        if(balance<=0){
            System.out.print("Account is died");
        }
        else{
            System.out.println("Your Name is" +" " + name + " and your Balance " +balance);
        }
    }
    
}
public class Balance{
    public static void main(String[] args) {
    Find mn = new Find("Akash",32.23);
    mn.show(); 
    }
}
 */
package newPack;
 class Balance {
    String name;
    double balance;

        Balance(String n , double b){
        name = n;
        balance=b;

    }
    void show(){
        if(balance<=0){
            System.out.print("Account is died");
        }
        else{
            System.out.println("Your Name is" +" " + name + " and your Balance " +balance);
        }
    }
    
}

 