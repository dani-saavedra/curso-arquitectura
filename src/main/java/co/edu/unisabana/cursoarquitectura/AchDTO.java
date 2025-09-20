package co.edu.unisabana.cursoarquitectura;

public class AchDTO {

    String producto;
    int monto;
    String cuentaOrigen;

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    @Override
    public String toString() {
        return "AchDTO{" +
                "producto='" + producto + '\'' +
                ", monto=" + monto +
                ", cuentaOrigen='" + cuentaOrigen + '\'' +
                '}';
    }
}
