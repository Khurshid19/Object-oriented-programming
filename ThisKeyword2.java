class ThisKeyword2{
void display()
{
    System.out.println("hello");

}

void show()
{
    this.display();

}

public static void main(String[]args)
{
    ThisKeyword2 t=new ThisKeyword2();
    t.show();
}
}