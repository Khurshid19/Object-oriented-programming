 
public class MethodOverriding4 {
	
	void car() {
	System.out.println("1");	
    }
}
class Riding extends MethodOverriding {
	void car() {
	
		System.out.println("3 ");
	}
	
	
	public static void main(String[]args) {
		MethodOverriding truck=new MethodOverriding();
		truck.car();
		
		Riding bike =new Riding() ;
		bike .car();
	}
}
