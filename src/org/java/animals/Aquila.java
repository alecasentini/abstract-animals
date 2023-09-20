package org.java.animals;

import org.java.animals.abs.Animale;
import org.java.animals.Main.IVolante;

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
