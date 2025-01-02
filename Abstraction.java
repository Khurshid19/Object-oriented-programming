abstract class Abstraction{
  abstract  void start();
}

class Car extends Abstraction 
{
    void start()
    {
        System.out.println("Car Starts with Key");
    }
}

class Scooter extends Abstraction{

    void start()
    {
        System.out.println("Scooter Starts with kick");
    }
    public static void main(String[]args){

        Car c=new Car();
        c.start();
        Scooter s=new Scooter();
        s.start();
    }
}
