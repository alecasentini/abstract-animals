package org.java.animals;

import org.java.animals.abs.Animale;
import org.java.animals.Main.IVolante;

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
