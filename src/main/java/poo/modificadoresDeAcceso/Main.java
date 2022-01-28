package poo.modificadoresDeAcceso;


//3
public class Main {
    public static void main(String[] args) {
        Celular op = new Celular("One Plus 8");
        op.setColor("Red");

        System.out.println("Soy el celular de marca/nombre: " + op.nombre + " Y soy de color " + op.getColor());
    }
}
