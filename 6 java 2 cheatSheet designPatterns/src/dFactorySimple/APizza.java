package dFactorySimple;

import java.util.ArrayList;

public abstract class APizza {
	
	String name;
	String dough;
	String sauce;
	
	ArrayList toppings = new ArrayList();

	void prepare() {
		System.out.println("preparing " + name);
		for(int i = 0; i<toppings.size(); i++) {
			System.out.println("    " + toppings.get(i));
		}
	}
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	public String getName() {
		return name;
	}

}
