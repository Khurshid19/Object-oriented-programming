public class OppsPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish shark = new Fish();
		shark.eat();

	}

}
 class Animal{
	 String   color;
	 void eat() {
		 System.out.println("eats");
	 }
	 void breathe(){
		 System.out.println("breathes");
	 }
 }
 class Fish extends Animal{
	 int fins;
	 void swim(){
		 System.out.println("swims in water");
	 }
 }
