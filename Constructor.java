class Constructor{

    String name ;
    int emp_id;

    Constructor(String name, int emp_id)
    {
        this.name = name;
        this.emp_id = emp_id;
    }
    void display()
     { 
        System.out.println("Name: " + name + ", emp_id: " + emp_id);
     }



    public static void main(String []args){
        Constructor c1= new Constructor("java", 10);
        Constructor c2= new Constructor("development", 11);
        Constructor c3= new Constructor("constructor", 12);
        Constructor c4= new Constructor("initialiaze", 13);

        c1.display();
        c2.display();
        c3.display();
        c4.display();

    }
}