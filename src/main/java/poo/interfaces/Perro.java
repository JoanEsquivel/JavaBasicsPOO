package poo.interfaces;

public class Perro implements Animal,SerVivo {

    public void tipoDeAnimal() {

        System.out.println("Soy un mamifero");

    }

    public String mostrarNombre() {
        return "Soy Gru";
    }

    public void mostrarVida() {
        System.out.println("Soy un ser vivo muy tuanis");
    }
}
