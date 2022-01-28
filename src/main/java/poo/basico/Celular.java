package poo.basico;

public class Celular {

    String nombre = "";
    String color = "";

    public Celular(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }
    public void llamar(){
        System.out.println(nombre + " - " + color + " esta llamando...");
    }

    public void llamadaEspecial(Celular ce){
        System.out.println("Este celular con nombre " + nombre + " y color  " + color + "...");
        System.out.println("Esta llamando a " + ce.nombre + " con color " + ce.color);
    }
}
