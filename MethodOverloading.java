class MethodOverloading{

    void Method(String s, int a)
    {
        System.out.println("Method 1");
    }

    void Method(int a)
    {
        System.out.println("Method 2");
    }

    public static void main(String []args)
    {
        MethodOverloading m = new MethodOverloading();
        m.Method("lkj",3);

    }
}
// same method name 
//within the same class 
//but arguments should be different in both Methods