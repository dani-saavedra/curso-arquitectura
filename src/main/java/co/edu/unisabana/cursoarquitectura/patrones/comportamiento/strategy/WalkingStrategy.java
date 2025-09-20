package co.edu.unisabana.cursoarquitectura.patrones.comportamiento.strategy;

public class WalkingStrategy implements RouteStrategy {
    @Override
    public int buildRoute(String puntoIncio, String puntoFin) {
        //Logica para calcular la ruta a pie....
        return 20;
    }
}
