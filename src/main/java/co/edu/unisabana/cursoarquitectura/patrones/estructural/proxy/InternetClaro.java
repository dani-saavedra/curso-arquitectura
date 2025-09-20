package co.edu.unisabana.cursoarquitectura.patrones.estructural.proxy;

public class InternetClaro implements Internet {
    @Override
    public String navegar(String url) {
        return "Obtiene el contenido de la pagina " + url;
    }
}
