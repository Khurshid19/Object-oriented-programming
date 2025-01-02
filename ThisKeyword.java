class ThisKeyword{
    int i;
    void setValue(int i){
        this.i=i;
    }
    void show(){
        System.out.println(i);
    }
}

class Xyz{
    public static void main(String[]args){
        ThisKeyword t = new ThisKeyword();
        t.setValue(10);
        t.show();
    }
}