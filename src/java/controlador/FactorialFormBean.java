/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Factorial.FactorialN;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@SessionScoped
public class FactorialFormBean {
private int n;
private int o;
private int p;
private int q;

    /**
     * Creates a new instance of FactorialFormBean
     */
    public FactorialFormBean() {
    }
    public int calcularFactorial(){
        FactorialN unFactorial = new FactorialN();
        unFactorial.asignarValor(n);
        return unFactorial.obtenerFactorial();
    }
    public int calcularSumatoria(){
        FactorialN sum = new FactorialN();
        sum.asignarValorSum(o);
        return sum.obtenerSumatoria();
    }
    public int calcularProductoria()
    {
        FactorialN produc = new FactorialN();
        produc.asignarValorProduc(p, q);
        return produc.obtenerProductoria();
    }
    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * @return the o
     */
    public int getO() {
        return o;
    }

    /**
     * @param o the o to set
     */
    public void setO(int o) {
        this.o = o;
    }

    /**
     * @return the p
     */
    public int getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(int p) {
        this.p = p;
    }

    /**
     * @return the q
     */
    public int getQ() {
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(int q) {
        this.q = q;
    }
    
}
