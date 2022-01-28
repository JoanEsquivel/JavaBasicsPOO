package basics;
//3
public class Strings {
    public static void main(String[] args) {
        String texto1 = "Hola Soy Texto";
        String texto2 = "Hola Soy Texto 2";
        String texto3 = "Hola Soy Texto 3";
        String texto4 = "Hola Soy Texto 4 ";

        //---- Compare To ----
        int resultadoIgual = texto1.compareTo(texto1);
        int resultadoTamanioMenor = texto1.compareTo(texto2);
        int resultadoTamanioIgualConDifencias = texto2.compareTo(texto3);
        int resultadoTamanioMayorConDiferencias = texto4.compareTo(texto3);

        System.out.println("--- Resultados compare to ---");
        System.out.println("Resultado Compare Igual: " + resultadoIgual);
        System.out.println("Resultado Compare no igual y con diferencia menor de tamanio: " + resultadoTamanioMenor);
        System.out.println("Resultado Compare no igual y mismo tamanio de cadena: " + resultadoTamanioIgualConDifencias);
        System.out.println("Resultado Compare no igual y con cadena 4 con mayor cantidad de caracteres: " + resultadoTamanioMayorConDiferencias);

        //Notas Compare To.
        // < 0 -> Lexicamente menor o igual pero con diferencias.
        // > 0 -> Lexicamnete mayor con diferencias.
        // = 0 -> Iguales

        //---- Contains ----
        System.out.println("--- Resultados Contains ---");
        boolean resultadoContains = false;
        resultadoContains = texto1.contains("1");
        System.out.println("Resultado Contains Negativo: " + resultadoContains);
        resultadoContains = texto2.contains("2");
        System.out.println("Resultado Contains Positivo: " + resultadoContains);

        //---- Index Of ----
        System.out.println("--- Resultado Index Of ---");
        int pos = texto1.indexOf("o");
        System.out.println("Posición de la primera letra O que tenga la cadena de texto: " + pos);

        //--- Substring ---
        System.out.println("--- Resultado Substring ---");
        String textNuevo = texto1.substring(pos, 4);
        System.out.println("Nuevo texto, tras usar substring: " + textNuevo);


    }
}
