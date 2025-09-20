package co.edu.unisabana.cursoarquitectura.patrones.estructural.proxy;

public class Proxy implements Internet {

    private Internet internet;

    public Proxy() {
        this.internet = new InternetClaro();
    }

    @Override
    public String navegar(String url) {

        if (url.contains("bet") || url.contains("xxx")) {
            throw new RuntimeException("Sitio prohibido");
        }

        return internet.navegar(url);

    }
}
