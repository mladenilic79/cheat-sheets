package rCompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BMenu extends AMenuComponent {

	Iterator iterator = null;
	
	ArrayList menuComponents = new ArrayList();
	String name;
	String description;

	public BMenu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void add(AMenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	public void remove(AMenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	public AMenuComponent getChild(int i) {
		return (AMenuComponent) menuComponents.get(i);
	}

	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}

	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			AMenuComponent menuComponent = (AMenuComponent) iterator.next();
			menuComponent.print();
		}
	}

	public Iterator createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}

}
