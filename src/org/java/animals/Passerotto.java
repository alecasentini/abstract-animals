package org.java.animals;

class Passerotto extends Animale implements IVolante {
	public void verso() {
        System.out.println("Cip");
    }

	public void mangia() {
        System.out.println("Semi");
    }
	
	 public void vola() {
	        System.out.println("Sto volando!!!");
	    }
}
