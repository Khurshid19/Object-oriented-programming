class Oops3
{
    public static void main(String[]args){
        Pen p1=new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);

        Pen p2=new Pen();
        p2.setTip(5);
        System.out.println(p2.tip);


    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int maths){
        percentage=(phy+chem+maths/3);
    }
}