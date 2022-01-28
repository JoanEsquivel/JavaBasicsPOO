package poo.herencia;

public class Main {
    //4
    public static void main(String[] args) {
        Perro perro1 = new Perro();

        perro1.setNombre("Gru");
        perro1.setTipo_de_alimentacion("Vegetariano");
        perro1.setEdad(9);
        perro1.setRaza("French Pull");

        perro1.informacionPerro();
    }
}
