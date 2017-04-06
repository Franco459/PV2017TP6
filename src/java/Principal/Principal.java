/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;

import Factorial.FactorialN;

/**
 *
 * @author Alumno
 */
public class Principal {
    
    public static void main (String[] arg) {
        mostrarFactorial();
    }
    public static void mostrarFactorial () {
        FactorialN fact = new FactorialN();
        fact.asignarValor(5);
        int res = fact.obtenerFactorial();
        System.out.println("El factorial es: " + res);
    }
    
}
