package org.java.animals;

class Aquila extends Animale implements IVolante{
	public void verso() {
        System.out.println("Kyaaa");
    }

	public void mangia() {
        System.out.println("Carne");
    }
	
	public void vola() {
        System.out.println("Sto volando!!!");
    }
}
