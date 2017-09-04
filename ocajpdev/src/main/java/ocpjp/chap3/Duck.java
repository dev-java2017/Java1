package ocpjp.chap3;

public abstract class Duck {
	protected Fly f;
	protected Soundable s;

	public Duck() {
	}

	public abstract void display();

	public void performFly() {
		f.fly();
	}

	public void performQuack() {
		s.makeSound();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
