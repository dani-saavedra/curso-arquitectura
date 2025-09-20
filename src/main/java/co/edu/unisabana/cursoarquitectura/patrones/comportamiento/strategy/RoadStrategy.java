package co.edu.unisabana.cursoarquitectura.patrones.comportamiento.strategy;

public class RoadStrategy implements RouteStrategy {
    @Override
    public int buildRoute(String puntoIncio, String puntoFin) {
        //Logica para calcular la ruta en carro....
        return 10;
    }
}
