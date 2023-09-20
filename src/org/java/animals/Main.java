package org.java.animals;

public class Main {
	
	static void faiVolare(IVolante animale) {
        animale.vola();
    }

    static void faiNuotare(INuotante animale) {
        animale.nuota();
    }
    
    public static void main(String[] args) {
        Cane cane = new Cane();
        cane.dormi();
        cane.verso();
        cane.mangia();

        Passerotto passerotto = new Passerotto();
        passerotto.verso();
        passerotto.mangia();
        Main.faiVolare(passerotto);
        passerotto.dormi();

        Delfino delfino = new Delfino();
        delfino.verso();
        delfino.mangia();
        Main.faiNuotare(delfino);
        delfino.dormi();

        Aquila aquila = new Aquila();
        aquila.verso();
        aquila.mangia();
        Main.faiVolare(aquila);
        aquila.dormi();
        
    }
    
}
