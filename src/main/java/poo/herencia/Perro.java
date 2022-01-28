package poo.herencia;

public class Perro extends Animal {

    private String raza = "";

//    public Perro(String nombre, String tipo_de_alimentacion, int edad, String raza){
//        super(nombre,tipo_de_alimentacion,edad);
//        this.raza = raza;
//    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void informacionPerro(){
        System.out.println("Soy el Perro: " + getNombre());
        System.out.println("Como alimentos de tipo: " + getTipo_de_alimentacion());
        System.out.println("Tengo la edad de: " + getEdad());
        System.out.println("Soy de la raza: " + getRaza());
    }
}
