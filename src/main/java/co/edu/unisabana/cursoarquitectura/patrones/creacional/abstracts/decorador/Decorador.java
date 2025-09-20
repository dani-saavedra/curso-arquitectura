package co.edu.unisabana.cursoarquitectura.patrones.creacional.abstracts.decorador;

/*
    Author: Daniel S
    Date: 18/09/2025
 */
public class Decorador {

    /*
    public void decorar(String tipoDecoracion) {
        if ("Victoriano".equals(tipoDecoracion)) {
            SillaVictoriana sillaVictoriana = new SillaVictoriana();
            SofaVictoriana sofaVictoriana = new SofaVictoriana();
        } else if ("Moderna".equals(tipoDecoracion)) {
            SillaModerna sillaModerna = new SillaModerna();
            SofaModerna sofaModerna = new SofaModerna();
        }
    }
     */

    public void decorar(AbstractFactory tipoDecoracion) {
        Silla silla = tipoDecoracion.crearSilla();
        Sofa sofa = tipoDecoracion.crearSofa();
    }
}
