package co.edu.unisabana.cursoarquitectura.patrones.comportamiento.strategy;

public class Main {

    public static void main(String[] args) {
        Navigator maps = new Navigator();
        maps.setRouteStrategy(new WalkingStrategy());
        int tiempo = maps.calcularViaje("Chia", "La Colina");

        System.out.println(tiempo);
    }
}
