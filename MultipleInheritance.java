
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bear b=new Bear();
		b.eat();
		Lion l=new Lion();
		l.eat();
	}

}


    interface Carnivore{
    	void eat();
    
    }
    interface Herbivore{
    	void eat();
    }
    class Bear implements Carnivore, Herbivore{
    	public void eat() {
    		System.out.println("Bear eats : " + "grass , meat , fruits , chapati , grains");
    	}
    }
    class Lion implements Carnivore{
    	public void eat() {
    		System.out.println("Lion eats :" + " meat only");
    	}
    }
    
    