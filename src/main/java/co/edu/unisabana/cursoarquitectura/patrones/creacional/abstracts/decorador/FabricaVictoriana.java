package co.edu.unisabana.cursoarquitectura.patrones.creacional.abstracts.decorador;

public class FabricaVictoriana implements AbstractFactory {

    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaVictoriana();
    }
}
