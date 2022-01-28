package basics;
//5
public class CicloFor {
    public static void main(String[] args) {
        String [] nombres = {"Jeff", "Minor", "Moni", "Joan"};

        System.out.println("--- FOR Simple para iterar un arreglo de nombres ---");

        for(int i = 0; i < nombres.length; i++){
            System.out.println("Nombre #" + (i+1)+ ": " + nombres[i]);
        }

        System.out.println("--- Otra forma de FOR para iterar un arreglo de nombres ---");
        int i=1;
        //FOR ENHANCED
        for(String nombre : nombres){
            System.out.println("Nombre #" + i + ": " + nombre);
            i++;
        }
    }
}
