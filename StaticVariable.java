class StaticVariable{

    int empid; 
    String name;
    String company;

    StaticVariable(int empid, String name, String company)
    {
        this.empid=empid;
        this.name=name;
        this.company=company;
    }

    void display ()
    {
        System.out.println(empid+ " "+name+" "+company);

    }
    public static void main(String[]args){
        StaticVariable s1=new StaticVariable(101, "Amit", "jaavaa programming");
        StaticVariable s2=new StaticVariable(102, "khueshid", "progra" );
        s1.display();
    }
}