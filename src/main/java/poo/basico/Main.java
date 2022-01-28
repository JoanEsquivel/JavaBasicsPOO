package poo.basico;


//1

public class Main {
    public static void main(String[] args) {

        Celular op = new Celular("One Plus 8", "Negro");
        Celular ip = new Celular("Iphone 12", "Blanco");

        op.llamar();

        ip.llamadaEspecial(op);

    }
}
