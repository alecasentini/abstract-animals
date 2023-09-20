package org.java.animals;

interface IVolante {
    public void vola();
}

interface INuotante {
    void nuota();
}

abstract class Animale {
    public void dormi() {
        System.out.println("Zzz");
    }

    public abstract void verso();

    public abstract void mangia();
    
}
