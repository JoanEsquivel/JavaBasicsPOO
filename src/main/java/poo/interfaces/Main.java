package poo.interfaces;

//6
public class Main {
    public static void main(String[] args) {
        Perro p = new Perro();

        p.tipoDeAnimal();
        System.out.println(p.mostrarNombre());
        p.mostrarVida();

        //Porque usar interfaces? Nos permite emular herencia multiple. O sea, obtener atributos y comportamientos de diferentes interfaces.


    }
}
