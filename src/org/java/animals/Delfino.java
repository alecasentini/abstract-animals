package org.java.animals;

import org.java.animals.abs.Animale;
import org.java.animals.Main.INuotante;

class Delfino extends Animale implements INuotante {
	public void verso() {
        System.out.println("Hic");
    }

	public void mangia() {
        System.out.println("Pesci");
    }
	
	 public void nuota() {
	        System.out.println("Sto nuotando!!!");
	    }
}
