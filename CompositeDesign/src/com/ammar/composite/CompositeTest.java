package com.ammar.composite;

public class CompositeTest {
	public static void main(String[] args) {
		Component hd=new Leaf(300,"HDD");
		Component mouse=new Leaf(50,"Mouse");
		Component monitor=new Leaf(120,"Monitor");
		Component ram=new Leaf(540,"Ram");
		Component cpu=new Leaf(1220,"CPU");
		
		
		Composite ph= new Composite("Peripheral");
		Composite case2= new Composite("Case");
		Composite mb= new Composite("MB");
		Composite computer= new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		case2.addComponent(hd);
		case2.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(case2);
		
		computer.showPrice();
	
	}

}
