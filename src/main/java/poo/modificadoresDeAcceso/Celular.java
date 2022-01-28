package poo.modificadoresDeAcceso;

public class Celular {

    public String nombre = "";
    private String color = "";
    //Like private, but if a class inherits it also will have access
    //    protected String serie = "";
    //    //Package Level
    //    int id = 0;

    public Celular(String nombre){
        this.nombre = nombre;
    }

    //Setters

    public void setColor(String color){
        this.color = color;
    }

    //Getters
    public String getColor(){
      return this.color;
    };

}
