package seriefibonacci;

import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de resultados de la serie Fibonacci: ");
        long limite = entrada.nextLong();
        
        System.out.println("n los Primeros" + limite + "de la serie Fibonacci son: " );
        fibonacci(limite, 0 ,1);
    }

    public static void fibonacci(long limite, long anterior, long actual) {
        if(limite > 0) {
             
            System.out.println(" " + actual);
            fibonacci(limite-1, actual ,anterior +actual);
        }
    }
}
