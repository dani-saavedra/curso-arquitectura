package co.edu.unisabana.cursoarquitectura.patrones.creacional.abstracts.decorador;

public class Main {

    public static void main(String[] args) {
        Decorador decorador = new Decorador();
        decorador.decorar(new FabricaVictoriana());
    }
}
