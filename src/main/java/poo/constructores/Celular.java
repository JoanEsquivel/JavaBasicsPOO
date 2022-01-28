package poo.constructores;

public class Celular {
    String nombre = "";
    String color = "";

    //Method overloading != Method overriding

    public Celular(String nombre, String color){
        this.nombre = nombre;
        this.color = color;

        llamar();
    }

    public Celular(String nombre){
        this.nombre = nombre;

        System.out.println("Mi nombre es: " + this.nombre);
    }

    public Celular(){

        System.out.println("Soy el constructor sin ningun parametro.");

    }


    public void llamar(){
        System.out.println(nombre + " - " + color + " esta llamando...");
    }

    public void llamadaEspecial(Celular ce){
        System.out.println("Este celular con nombre " + nombre + " y color  " + color + "...");
        System.out.println("Esta llamando a " + ce.nombre + " con color " + ce.color);
    }
}
