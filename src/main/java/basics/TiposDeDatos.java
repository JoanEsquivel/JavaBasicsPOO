package basics;
//2
//Mas referencias en https://aprenderaprogramar.com/index.php?option=com_content&view=article&id=419:tipos-de-datos-java-tipos-primitivos-int-boolean-y-objeto-string-array-o-arreglo-variables-cu00621b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188

public class TiposDeDatos {

    public static void main(String[] args){
        //Tipos datos primitivos mas utilizados
        int numeroEntero = 2;
        double numeroDecimal = 2.2;
        boolean verdad = true;
        boolean falso = false;

        //Tipos de datos tipo objeto mas utilizados
        String cadenaDeTexto = "Hola soy un String";
        String arreglo [] = {"Arreglo item 1", "Arreglo item 2", "Arreglo item 3"};

        System.out.println("--- Datos primitivos ---");
        System.out.println("Numero Entero: " + numeroEntero);
        System.out.println("Numero Decimal: " + numeroDecimal);
        System.out.println("Booleano verdadero: " + verdad);
        System.out.println("Booleano falso: " + falso);

        System.out.println("--- Datos tipo Objeto ---");
        System.out.println("Cadena de texto[STRING]: " + cadenaDeTexto);
        System.out.println("Arreglo en posición 1 con valor 2: " + arreglo[1]);

        //Caso de convertir String a int
        String numeroEnTexto = "2";
        int suma = Integer.parseInt(numeroEnTexto) + 2;
        System.out.println("---> Resultado tras convertir String a Int y sumar: " +suma);

    }
}
