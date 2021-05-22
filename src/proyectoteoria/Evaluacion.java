/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoteoria;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Evaluacion {

    String expresion;
    ArrayList alfabeto = new ArrayList();

    public Evaluacion(String expresion) {
        this.expresion = expresion;
        alfabeto.add('a');
        alfabeto.add('b');
        alfabeto.add('c');
        alfabeto.add('0');
        alfabeto.add('1');
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public boolean problema1() { // 1 y 0 alternos
        char par = expresion.charAt(0);
        char impar = expresion.charAt(1);

        boolean vf = true;

        for (int i = 2; i < expresion.length(); i++) {

            char temp = expresion.charAt(i);
            if (i % 2 == 0) {
                if (par != temp) {
                    vf = false;
                    break;
                }
            } else {
                if (impar != temp) {
                    vf = false;
                    break;
                }
            }
        }

        return vf;
    }

    public boolean problema2() {//al menos una a y al menos una b
        boolean a = false, b = false;
        for (int i = 0; i < expresion.length() - 1; i++) {
            if (alfabeto.get(0).equals(expresion.charAt(i))) {
                a = true;
            }
            if (alfabeto.get(1).equals(expresion.charAt(i))) {
                b = true;
            }
        }
        if (a == true && b == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean problema3() {// igual cantidad de 1s y 0s
        int cont0 = 0, cont1 = 0;
        boolean iguales = false;
        for (int i = 0; i < expresion.length(); i++) {

            if (alfabeto.get(3).equals(expresion.charAt(i))) {
                cont0++;
            } else if (alfabeto.get(4).equals(expresion.charAt(i))) {
                cont1++;
            }
        }
        if (cont0 == cont1) {
            iguales = true;
        }

        return iguales;
    }

    public boolean problema4() {//terminen en 101
        boolean vf = false;

        if (expresion.length() >= 3) {
            if ((expresion.charAt(expresion.length() - 1) == '1')
                    && (expresion.charAt(expresion.length() - 2) == '0')
                    && (expresion.charAt(expresion.length() - 3) == '1')) {
                vf = true;
            }
        }

        return vf;
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "expresion=" + expresion + ", alfabeto=" + alfabeto + '}';
    }

}
