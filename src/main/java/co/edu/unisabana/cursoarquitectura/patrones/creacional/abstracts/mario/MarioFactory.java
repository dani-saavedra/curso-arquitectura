package co.edu.unisabana.cursoarquitectura.patrones.creacional.abstracts.mario;

public interface MarioFactory {

    Mundo crearMundo();

    IEnemigo crearEnemigo();
}
