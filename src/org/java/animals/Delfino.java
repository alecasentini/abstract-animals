package org.java.animals;

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
