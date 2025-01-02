class MethodOverridingg{
    void Overriding()
    {
        System.out.println("parent class");
    }
}

class OverridingMethod extends MethodOverridingg{

    void Overriding()
    {
        super.Overriding();
        System.out.println("child class");
    }
    public static void main(String[]args)
    {
        
        OverridingMethod m=new OverridingMethod();
        m.Overriding();

    }
}
// we can call parent class function/methods by using super keyword in MethodOverriding