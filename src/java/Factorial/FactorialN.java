/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

/**
 *
 * @author Alumno
 */
public class FactorialN {
    private int n;
    private int o;
    private int p;
    private int q;
    public FactorialN() {
    }

    public FactorialN(int n) {
        this.n = n;
    }
    public void asignarValorProduc(int num, int num2){
        this.p= num;
        this.q = num2;
    }
    public int obtenerProductoria()
    {
        int init = this.p;
        int fin = this.q;
        while(true)
        {
            if(init >= fin) break;
            this.q= this.q*init;
            init++;
        }
        return this.q;
    }
    public void asignarValorSum (int num)
    {
        this.setO(num);     
    }
    public int obtenerSumatoria()
    {
        int valorFactorial=1;
        int aux=getO();
        while (getO()>=1) {
            valorFactorial=valorFactorial+getO();
            setO(getO() - 1);
        }
        setO(aux);
        return valorFactorial-1;        
    }
    public void asignarValor (int num) {
        setN(num);
    }
    public int obtenerFactorial () {
        int valorFactorial=1;
        int aux=getN();
        while (getN()>=1) {
            valorFactorial=valorFactorial*getN();
            setN(getN() - 1);
        }
        setN(aux);
        return valorFactorial;
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
