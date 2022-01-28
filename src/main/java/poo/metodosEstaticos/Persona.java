package poo.metodosEstaticos;

public class Persona {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void saludar(){
        System.out.println("Soy una persona cool");
    }
}
