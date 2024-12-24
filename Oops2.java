public class Oops2{

    public void eat()
    {
        System.out.println("Im Eating");
    }

    public void run(){
        System.out.println("Im running");
    }
   

    public static void main(String[]args)
    {
        System.out.println("1");
        Oops2 obj1= new Oops2();
        obj1.eat();
        obj1.run();

        Birds sp=new Birds();
        sp.fly();



    }

}

class Birds{
    public void fly()
    {
        System.out.println("Im flying");
    }
}