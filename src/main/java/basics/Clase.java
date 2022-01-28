package basics;

//7
public class Clase {
    String nombreDeClase = "";
    int edadDeClase = 0;

    public void saludar(){
        nombreDeClase = "Clase Alfa";
        edadDeClase = 25;

        System.out.println("Hola Soy " + nombreDeClase + " y tengo " + edadDeClase + " años.");
    }

    public static void main(String[] args) {
        Clase cl = new Clase();

        cl.saludar();
    }
}
