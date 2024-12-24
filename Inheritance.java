class Inheritance{
    void eat()
    {
        System.out.println("eating");
    }
}

class Dog extends Inheritance{
    public static void main(String[]args){
        Dog d=new Dog();
        d.eat();
    }
}

