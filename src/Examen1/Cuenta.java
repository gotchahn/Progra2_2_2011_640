/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Examen1;

import java.util.Date;

/**
 *
 * @author Carlos Gochez
 */
public class Cuenta {
    protected String nombre;
    protected int cod;
    protected double tasa;
    protected Date apertura;
    protected double saldo;

    public Cuenta(String n,int c){
        nombre = n;
        cod = c;
        saldo = 0;
        tasa = 0.045;
        apertura = new Date();
    }

    public double registrarIntereses(){
        double aum = saldo * tasa;
        saldo += aum;
        return aum;
    }

    public void imprimir(){
        System.out.println("datos: " + nombre + cod +
                tasa + saldo + apertura.toString());
    }






}
