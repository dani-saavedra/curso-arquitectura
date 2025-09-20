package co.edu.unisabana.cursoarquitectura.patrones.creacional.abstracts.decorador;

public class FabricaModerna implements AbstractFactory {

    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaModerna();
    }
}
