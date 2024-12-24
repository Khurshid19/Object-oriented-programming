class Parameterized_Constructor{
    String name;
    int emp_id;

    Parameterized_Constructor (String name, int emp_id)
    {
        this.name=name;
        this.emp_id=emp_id;
    }

    public static void main(String[]args){

        Parameterized_Constructor p1=new  Parameterized_Constructor("java",12);
        Parameterized_Constructor p2 =new  Parameterized_Constructor("abc",43);

        System.out.println("Employee 1 : " + p1.name + " " + p1.emp_id);
        System.out.println("Employee 2 : " + p2.name + " " + p2.emp_id);


    }
}