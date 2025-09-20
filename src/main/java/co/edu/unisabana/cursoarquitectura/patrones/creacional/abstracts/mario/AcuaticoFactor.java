package co.edu.unisabana.cursoarquitectura.patrones.creacional.abstracts.mario;

public class AcuaticoFactor implements MarioFactory {
    @Override
    public Mundo crearMundo() {
        return new MundoOver("Que hay mucha Agua");
    }

    @Override
    public IEnemigo crearEnemigo() {
        return new Enemigo(10, 20);
    }
}
