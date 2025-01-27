public class MethodOverloading2 {
	
	void show(int a , String b) {
		System.out.println("1");
	}
		
	void show(String a ,int b) {
		System.out.println("2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m=new MethodOverloading();
		m.show("abc",8 );

	}

}
