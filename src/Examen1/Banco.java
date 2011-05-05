/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Examen1;

/**
 *
 * @author Carlos Gochez
 */
public class Banco {
    public static void main(String args[]){
        //up
        Cuenta c = new CuentaCorriente("Calor",1);
        //down
        CuentaCorriente cc = (CuentaCorriente)c;
    }
}
