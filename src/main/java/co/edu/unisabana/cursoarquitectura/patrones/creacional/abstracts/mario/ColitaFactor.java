package co.edu.unisabana.cursoarquitectura.patrones.creacional.abstracts.mario;

public class ColitaFactor implements MarioFactory {
    @Override
    public Mundo crearMundo() {
        return new MundoOver("Enmigos que vuelan");
    }

    @Override
    public IEnemigo crearEnemigo() {
        return new Enemigo(30, 10);
    }
}
