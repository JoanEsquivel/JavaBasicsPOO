package basics;

//4
public class CondicionalIf {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;
        int numero3 = 15;

        boolean verdadero = true;
        boolean falso = false;

        //--- Simple if & Nested If---
        System.out.println("--- Simple if & Nested If ---");
        if(numero1 == 5){
            System.out.println("- Message inside the simple if -");
            if(numero2 == 10){
                System.out.println("-- Message inside of the nested if --");
            }
        }

        //--- If, Else If & else---
        System.out.println("--- If, Else If & else ---");
        if(!verdadero){
            System.out.println("- Hola desde el IF inicial, probablemente no aparezca. -");
        }else if(verdadero){
            System.out.println("- Hola desde el ELSE IF!!!");

            if(numero1 == 10){
                System.out.println("-- Hola desde el NESTED IF, sin pasar por el ELSE --");
            }else{
                System.out.println("-- Hola desde el NESTED IF, pasando por el ELSE --");
            }
        }

    }
}
