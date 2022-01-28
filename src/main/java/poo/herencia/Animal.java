package poo.herencia;

public class Animal {
    private String nombre = "";
    private String tipo_de_alimentacion = "";
    private int edad = 0;

//    public Animal(String nombre, String tipo_de_alimentacion, int edad){
//        this.nombre = nombre;
//        this.tipo_de_alimentacion = tipo_de_alimentacion;
//        this.edad = edad;
//    }


    //Setters and getters auto generated
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_de_alimentacion() {
        return tipo_de_alimentacion;
    }

    public void setTipo_de_alimentacion(String tipo_de_alimentacion) {
        this.tipo_de_alimentacion = tipo_de_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
