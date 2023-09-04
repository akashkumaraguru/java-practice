 class Dog {
    String color;
    int age;

    Dog(){
        //default
        String color="brown";
        int age=0;
    }
    Dog(String c ,int a) {
        //parameter
        color=c;
        age=a;
    }
    Dog(int a){
        //single
        age=5;

    }

    void display(){
        System.out.println("you're puppy is here!");
    }

     public static void main(String[] args) {
         Dog labradour=new Dog(1);

         //Dog vodafone=new Dog();
         //vodafone.age=2;
         //vodafone.color="black";


         labradour.display();
         System.out.println(labradour);

     }
}
