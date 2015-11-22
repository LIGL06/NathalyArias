/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoNath;
import java.util.*;
/**
 *
 * @author LuisIván
 */
public class logica {
    private double base;
    private double guesser;
    Scanner sc = new Scanner(System.in);

    public logica(double base) {
        this.base = base;
        this.guesser = 0;
    }

    public double getBase() {
        return base;
    }

    public double getGuesser() {
        return guesser;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setGuesser(double guesser) {
        this.guesser = guesser;
    }
    
    public void makeTablewithOne(double base,double adivinado){
        int r=0; double n=1;
        for(int i =1;i<=10;i++){
            do {
                r+=r;
                if(adivinado == n) n=sc.nextDouble();
            } while (n!=base*i);
           i++;
        }
    }
    
    public void makeTablewithTwo(double base){
        int r=0; double n=1;
        for(int i =1;i<=10;i++){
            do {
                r+=r;
            } while (n!=base*i);
           i++;
        }
    }

    public void makeTablewithThree(double base,double adivinado){
        int r=0; double n=1;
        for(int i =1;i<=10;i++){
            do {
                r+=r;
                System.out.println(base + " x " + i + " = ");
                if(adivinado == n) n=sc.nextDouble();
            } while (n!=base*i);
           i++;
        }
    }
    
    @Override
    public String toString() {
        String stingFinal = "";
        for (int i = 0; i < 10; i++) {
            
        }
        return stringFinal;
    }
    
    
}
