class Addtwo {
    int a, b, c;

    Addtwo(int on,int tw){
        int a=on;
        int b=tw;
    }

    public void addmain() {
        c = a + b;
        System.out.println("the adding number is" + c);
    }
    public static void main(String[] args) {
        Addtwo num=new Addtwo(16,20);
       num.addmain();


    }
}



