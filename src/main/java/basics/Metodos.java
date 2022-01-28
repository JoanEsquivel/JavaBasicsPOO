package basics;


//8
public class Metodos {
    String nombreDeClase = "";
    int edadDeClase = 0;

    public void setearNombre(String nombre){
        nombreDeClase = nombre;
    }

    public String obtenerNombre(){

      return nombreDeClase;

    };

    public static void main(String[] args) {
        Metodos mt = new Metodos();

        mt.setearNombre("Monica");
        String nombreDeClase = mt.obtenerNombre();
        System.out.println("El nombre de la clase es: " + nombreDeClase);
    }




}
