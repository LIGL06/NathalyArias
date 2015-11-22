/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoNath;

import java.util.*;

/**
 *
 * @author nathalyarias
 */
public class Base {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tb, n;
        int i, r;
        i = 1;
        r = 0;
        n = 1;

        System.out.print("Tabla que se desea practicar: ");
        tb = sc.nextDouble();

        for (i = 1; i <= 10; i++) {
            do {
                r = r + 1;
                System.out.print(tb + " x " + i + " = ");
                n = sc.nextDouble();
            } while (n != tb * i);
            i = i++;
        }

        System.out.print(" ");
        System.out.print("**Número de intentos = " + (r)+"**Te equivocaste en: "+(r-10));
    }
}
