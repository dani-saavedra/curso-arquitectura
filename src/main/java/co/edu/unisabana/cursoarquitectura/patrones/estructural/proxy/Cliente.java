package co.edu.unisabana.cursoarquitectura.patrones.estructural.proxy;

public class Cliente {

    public static void main(String[] args) {
        Internet internet = new Proxy();
        String contenido = internet.navegar("oreilly");
        System.out.println(contenido);

        String contenidoApuesta = internet.navegar("betplay");
        System.out.println(contenidoApuesta);
    }
}
