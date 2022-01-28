package poo.polimorfismo;

public class Main {

    //5
    public static void main(String[] args) {
        Animal perro1 = new Perro("Gru", "Vegetariano de mentira", 9, "French Pull");
        Animal caballo1 = new Caballo();

        perro1.alimentarse();
        caballo1.alimentarse();

        perro1.moverse();
        caballo1.moverse();

        //Polimorfismo se puede definir como la capacidad de que un metodo se comporte de manera distinta de acuerdo a la instancia de un objeto.
        //El encapsulamiento es dar soluciones, sin que el usuario final sepa como se llego a esto. Podemos imaginar el ejemplo de cuando hacemos un driver.open(). No nos preocupamos por lo que esta hecho, solo lo que hace.
    }
}
