/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoteoria;

/**
 *
 * @author David
 */
public class Evaluacion {
    String expresion;

    public Evaluacion(String expresion) {
        this.expresion = expresion;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }
    
    public boolean problema2() {//al menos una a y al menos una b
        boolean a = false, b = false;
        for (int i = 0; i < expresion.length() - 1; i++) {
            if (expresion.charAt(i) == 'a') {
                a = true;
            }
            if (expresion.charAt(i) == 'b') {
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
        for (int i = 0; i < expresion.length() - 1; i++) {
            if (expresion.charAt(i) == '0') {
                cont0++;
            } else if (expresion.charAt(i) == '1') {
                cont1++;
            }
        }
        if (cont0 == cont1) {
            return true;
        } else {
            return false;
        }
    }
    
}
