interface I1
{
    void show();
}
interface I2
{
    void display();
}

class Interfacee implements I1,I2{

    public void show()
    {
        System.out.println("1");
    } 

    public void display()
    {
        System.out.println("2");
    }

    public static void main(String[]args){
        Interfacee i=new Interfacee();
        i.show();
        i.display();
    }

}