import java.nio.charset.Charset;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial: " + factorial(4));

        System.out.println("Codigo Aleatorio: " + claveAleatoria());

    }



    // Escribir una función, la cual reciba un número y se calcule el factorial usando
    // recursividad.
    public static double factorial(double number){
        if(number == 0) return 1;
        return (number * factorial(number-1));
    }



    /*
    Escribir una función que genere una clave aleatoria sin usar regex, con las siguientes
    características.
    - Debe tener entre 8 y 15 caracteres
    - Debe contener al menos 2 mayúscula
    - Debe contener al menos 2 minúscula
    - Debe contener al menos 2 dígitos
    */
    public static String claveAleatoria(){
        double longitud = Math.floor(Math.random() * (15 - 8) + 8);
        String NumericMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String NumericMinus = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String theAlphaNumericS = NumericMayus+NumericMinus+numbers;
        StringBuilder builder = new StringBuilder((int) longitud);


            // Debe contener al menos 2 dígitos
            while(builder.length()<2){

                // generate numeric
                int myindex
                        = (int)(numbers.length()
                        * Math.random());

                // add the characters
                builder.append(numbers
                        .charAt(myindex));
            }

            // Debe contener al menos 2 miyúscula
            while (builder.length()<4){

                // generate numeric
                int myindex
                        = (int)(NumericMayus.length()
                        * Math.random());

                // add the characters
                builder.append(NumericMayus
                        .charAt(myindex));
            }

            // Debe contener al menos 2 minúscula
            while (builder.length()<6){

                // generate numeric
                int myindex
                        = (int)(NumericMinus.length()
                        * Math.random());

                // add the characters
                builder.append(NumericMinus
                        .charAt(myindex));
            }

            // Ubicar los demas caracteres aleatorios para completar la longitud
            while (builder.length()<longitud){
                // generate numeric
                int myindex
                        = (int)(theAlphaNumericS.length()
                        * Math.random());

                // add the characters
                builder.append(theAlphaNumericS
                        .charAt(myindex));
            }

        return builder.toString();
    }


}

