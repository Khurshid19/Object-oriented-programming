class HierarchicalInheritance{
    void eat ()
    {
        System.out.println("eating");
    }
    void Sleep(){
        System.out.println("Sleeping");
    }
}

class Dogg extends HierarchicalInheritance{
    void run(){
        System.out.println("running");
    }
}
class Parrot extends HierarchicalInheritance{
    void fly(){
        System.out.println("flying");
    }

    public static void main(String[]args){
        Parrot s=new Parrot();
        s.eat();
        s.Sleep();


    }
}