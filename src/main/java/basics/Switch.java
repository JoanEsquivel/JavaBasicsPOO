package basics;

import java.util.Scanner;
//6
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Favor ingrese un numero valido(1 para Jeff o 2 para Minor): ");
        int resultado = sc.nextInt();

        switch(resultado){
            case 1:
                System.out.println("Hola Soy Jeff");
                break;
            case 2:
                System.out.println("Hola Soy Minor");
                break;
            default:
                System.out.println("No se ingreso una opcion valida.");
                break;
        }
    }
}
