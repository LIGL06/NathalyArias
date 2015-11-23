/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author LuisIván
 */
public class logica {
    private double table;
    private double dato;
    private int r;
    private String[] st;
    private String stringf;

    public logica(double table) {
        this.table = table;
        this.dato = 1;
        this.r = 1;
    }

    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }

    public String[] makeTableWithOne(double table,double numero){
        for (int i = 1; i <=10; i++) {
            do {
                r++;
                st[i] = (table+ " x " + i + " = ");
                setDato(numero);
            } while (numero!= table * i);
          i++; 
        }
        stringf = ("**Número de intentos = " + (r)+"**Te equivocaste en: "+(r-10));
       return st;
    }

    
    

   
    

    
    
    
}
