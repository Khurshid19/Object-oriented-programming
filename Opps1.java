public class Opps1 {
	String name;
	int roll_no;
	int marks;
	public void printdata() {
		System.out.println("name : " +name);
		System.out.println("roll no. : " + roll_no);
		System.out.println("marks :"+ marks);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Opps1 std1= new Opps1();
		std1.name = "John";
		std1.marks= 88;
		std1.roll_no=34;
		std1.printdata();
		
	}

}
