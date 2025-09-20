package co.edu.unisabana.cursoarquitectura.patrones.creacional.abstracts.mario;

public class MundoOver implements Mundo {

    private String caracteristicas;

    public MundoOver(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public void mostrarAmbiente() {
        System.out.println(caracteristicas);
    }
}
