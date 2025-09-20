package co.edu.unisabana.cursoarquitectura.solid.l;

public class Main {
    public static void main(String[] args) {
        tocarAnimal(new Gato());
    }

    private static void tocarAnimal(Animal animal) {
        animal.emitirSonido();
    }

}
