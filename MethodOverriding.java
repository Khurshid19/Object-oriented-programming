class MethodOverriding{

    void Overriding()
    {
        System.out.println("First class of Overriding");
    }
        
}
class MethodOverriding2{

    void Overriding()
    {
        System.out.println("Second class of Overriding");
    }
    public static void main(String[]args)
    {
        MethodOverriding2 o = new MethodOverriding2();
        o.Overriding();

    }
}
//same method name 
//different class 
// same arguments 
//inheritence (IS-A Relationship) child class must extends paremts class 