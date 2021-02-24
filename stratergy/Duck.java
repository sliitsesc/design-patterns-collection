package design.pattern.stratergy;

public abstract class Duck {
	
	IFlyBehaviour flyBehaviour;
	
	IQuackBehaviour quackBehaviour;
	
	public abstract void display();
	
	public void performFly(){
		flyBehaviour.fly();
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	
	public void swim(){
		System.out.println("All ducks float even Decoy");
	}

	/**
	 * @param flyBehaviour the flyBehaviour to set
	 */
	public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	/**
	 * @param quackBehaviour the quackBehaviour to set
	 */
	public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	

}
