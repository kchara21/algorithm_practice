
public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    // Escribir una función, la cual reciba un número y se calcule el factorial usando
    // recursividad.
    public static double factorial(double number){
        if(number == 0) return 1;
        return (number * factorial(number-1));
    }

}

