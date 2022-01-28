package poo.polimorfismo;


//Se agregaron dos metodos al final: Alimentarse y moverse. Alimentarse es diferente para cada Animal
//Con la palabra abstract en una clase, esta no podra ser instanciada directamente y nos permite definir metodos abstractos para implementar metodos en otras clases.
public abstract class Animal {

        private String nombre = "";
        private String tipo_de_alimentacion = "";
        private int edad = 0;

        public Animal(String nombre, String tipo_de_alimentacion, int edad){
            this.nombre = nombre;
            this.tipo_de_alimentacion = tipo_de_alimentacion;
            this.edad = edad;
        }

        public Animal(){

        }


        //Setters and getters auto generated
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTipo_de_alimentacion() {
            return tipo_de_alimentacion;
        }

        public void setTipo_de_alimentacion(String tipo_de_alimentacion) {
            this.tipo_de_alimentacion = tipo_de_alimentacion;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        //Alimentarse funciona diferente para distintos animales.
        public abstract void alimentarse();

        public void moverse(){
            System.out.println("El Animal se esta moviendo");
        }
}

