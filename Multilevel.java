class Multilevel{
    void eat()
    {
        System.out.println("im eating");
    }
}

class Dogs extends Multilevel{
    void run()
    {
        System.out.println("im running ");
    }

}

class Bird extends Dogs{

    void fly()
    {
        System.out.println("im flying");
    }
    public static void main(String[]args)
    {
        Multilevel m=new Multilevel();
        m.eat();
        System.out.println("..................................");

        Dogs d=new Dogs();
        d.eat();
        d.run();
        System.out.println(" .................................");

        Bird b =new Bird();
        b.fly();
        b.eat();
        b.run();
    }
}