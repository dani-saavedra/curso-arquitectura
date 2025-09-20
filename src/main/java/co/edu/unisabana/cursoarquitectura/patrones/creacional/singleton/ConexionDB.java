package co.edu.unisabana.cursoarquitectura.patrones.creacional.singleton;

public class ConexionDB {

    private static ConexionDB conexionDB;

    private ConexionDB() {

    }

    public static ConexionDB getInstance() {
        if (conexionDB == null) {
            conexionDB = new ConexionDB();
            //TODA LA CONEXION JDBC a la base de datos.
        }
        return conexionDB;
    }
}
