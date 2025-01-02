     class FinalKeyword2
{
    final void start()
    {
        System.out.println("starting");
    }
}

class Caar extends FinalKeyword2 {

    void run()
    {
        System.out.println("Running");
    }

    public static void main(String[]args)
    {
        Caar c=new Caar();
        c.start();
        c.run();

    }
}