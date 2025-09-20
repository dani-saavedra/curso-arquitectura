package co.edu.unisabana.cursoarquitectura.patrones.comportamiento.strategy;

public class Navigator {

    private RouteStrategy routeStrategy;


    public int calcularViaje(String puntoA, String puntoB) {
        //Busca restaurantes cerca del punto B
        int tiempo = routeStrategy.buildRoute(puntoA, puntoB);
        //Notifica a Uber que hay gente en el punto B.
        return tiempo;
    }

    public RouteStrategy getRouteStrategy() {
        return routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }
}
