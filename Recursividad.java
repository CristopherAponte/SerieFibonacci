/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author DELL
 */
public class Recursividad {

    public int factorial(int n) {

        if (n <= 1) {

            return 1;

        } else {
            int a = n*factorial(n-1);
            System.out.println(a);
           // return n * factorial(n - 1);
           
           return a;
        }
    }

    public static void main(String[] args) {
        
     Recursividad r = new Recursividad();
     int respues = r.factorial(5);
     
        System.out.println("El factorial es: " +respues);
        
    }

}
