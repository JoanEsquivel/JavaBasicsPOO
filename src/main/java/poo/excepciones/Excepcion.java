package poo.excepciones;

public class Excepcion {

    public void proceso1 (){
        int x = 7, y =0;
        int division = x/y;
    }

    public static void main(String[] args) {

        Excepcion proceso = new Excepcion();
//        proceso.proceso1();
        try {
            //Proceso
            proceso.proceso1();

        }catch (Exception e){
            //Donde se capta la excepcion
            System.out.println(e);

        }finally {
            //Se ejecuta si o si.
            System.out.println("Ejecutando bloque finally");

        }
    }
}
