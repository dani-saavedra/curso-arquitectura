package co.edu.unisabana.cursoarquitectura.patrones.creacional.abstracts.mario;

public class Enemigo implements IEnemigo {

    private int poder;
    private int vida;

    public Enemigo(int poder, int vida) {
        this.poder = poder;
        this.vida = vida;
    }

    @Override
    public void atacar() {
        System.out.println("Atacando con tanto poder " + poder);
    }
}
