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
public class Transaccion {
    public double monto;
    public char tipoTrans;
    public Date realizado;

    public Transaccion(double m,char t){
        monto = m;
        tipoTrans = t;
        realizado = new Date();
    }

    public void Imprimir(){
        System.out.println("Datos: " + monto + tipoTrans +
                realizado.toString());
    }
}
