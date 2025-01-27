interface Vehicl{
	public  void start();
}

class ElectricCar implements Vehicl{
	public void start() {
		System.out.println("Electric car Starts");
	}
}
class Dieselcar implements Vehicl{
	public void start () {
		System.out.println("Diesel car starts");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicl Tesla=new ElectricCar();
		Vehicl XUV700=new Dieselcar();
		Tesla.start();
		XUV700.start();

	}

}
