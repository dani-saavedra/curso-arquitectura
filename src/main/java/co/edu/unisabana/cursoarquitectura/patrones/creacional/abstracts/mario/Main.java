package co.edu.unisabana.cursoarquitectura.patrones.creacional.abstracts.mario;

public class Main {

    public static void main(String[] args) {

        MarioFactory factory = new AcuaticoFactor();
        factory.crearMundo();
        factory.crearEnemigo();
    }
}
