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
    }

    public double getTable() {
        return table;
    }

    public double getDato() {
        return dato;
    }

    public int getR() {
        return r;
    }

    public String[] getSt() {
        return st;
    }

    public String getStringf() {
        return stringf;
    }

    public void setTable(double table) {
        this.table = table;
        this.r=0;
        this.dato=0;
        this.st=null;
        this.stringf=null;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setSt(String[] st) {
        this.st = st;
    }

    public void setStringf(String stringf) {
        this.stringf = stringf;
    }

    public String[] makeTableWithOne(double table,double []numero){
        for (int i = 0; i <=10; i++) {
            do {
                r++;
                st[i] = (table+ " x " + i + " = ");
                setDato(numero[i]);
            } while (numero[i]!= table * i);
          i++; 
        }
        stringf = ("**Número de intentos = " + (r)+"**Te equivocaste en: "+(r-10));
       return st;
    }

    @Override
    public String toString() {
        return "Numero de intentos{" + r + '}'+"Te equivaste en:"+(r-10);
    }
    

    
    

   
    

    
    
    
}
