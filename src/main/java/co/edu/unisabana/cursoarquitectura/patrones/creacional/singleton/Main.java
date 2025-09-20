package co.edu.unisabana.cursoarquitectura.patrones.creacional.singleton;

public class Main {
    public static void main(String[] args) {

        ConexionDB conexionDB = ConexionDB.getInstance();
        System.out.println(conexionDB);


        ConexionDB conexionDB_2 = ConexionDB.getInstance();
        System.out.println(conexionDB_2);
    }
}
