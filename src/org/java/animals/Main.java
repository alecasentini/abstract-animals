package org.java.animals;

public class Main {
	public interface IVolante {
	    public void vola();
	}

	public interface INuotante {
	    void nuota();
	}
	
	static void faiVolare(IVolante animale) {
        animale.vola();
    }

    static void faiNuotare(INuotante animale) {
        animale.nuota();
    }
    
    public static void main(String[] args) {
        Cane cane = new Cane();
        cane.verso();
        cane.mangia();
        cane.dormi();

        Passerotto passerotto = new Passerotto();
        passerotto.verso();
        passerotto.mangia();
        faiVolare(passerotto);
        passerotto.dormi();

        Delfino delfino = new Delfino();
        delfino.verso();
        delfino.mangia();
        faiNuotare(delfino);
        delfino.dormi();

        Aquila aquila = new Aquila();
        aquila.verso();
        aquila.mangia();
        faiVolare(aquila);
        aquila.dormi();
        
    }
    
}
