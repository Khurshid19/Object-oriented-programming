
class Students{
	int id;
	int age;
	//String name;
	Students(int id,int age){
		this.id=id;
		this.age=age;
		//this.name=name;
		System.out.println("Parameterized Constructor");
		
	}
	Students(int id, String name, int age){
		System.out.println("Parameterized Constructor 2");
	}
	/*Students(){
		System.out.println("Parameterized Constructor");
	}*/
	Students(){
		System.out.println("Default Consrtructor");
	}
}

public class Constructordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj = new Students();

	}

}
 