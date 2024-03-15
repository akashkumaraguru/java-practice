public class recursivefact{
    int n;
    int factoral(int n){
        if(n==0){
            return(1);
        }
        else{
            return (n*factoral(n-1));
        }
    }
    public static void main(String[] args) {
        recursivefact x = new recursivefact();
        x.n =Integer.parseInt(args[0]);
        System.out.println("Factorial of 0"+x.factoral(x.n));
    }
}