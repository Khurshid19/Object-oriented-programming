class ThisKeyword3{
    ThisKeyword3()
    {
        System.out.println("no arg constructoir");

    }
    ThisKeyword3(int a)
    {
        this();
        System.out.println("parameterised constructor");

    }
    public static void main(String[]args){
        ThisKeyword3 td=new ThisKeyword3(10);
    }
}