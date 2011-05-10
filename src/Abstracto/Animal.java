/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstracto;

/**
 *
 * @author Carlos Gochez
 */
public abstract class Animal {
    protected String mascota;
    protected int numpatas;

    public Animal(String m,int np){
        mascota = m;
        numpatas = np;
    }

    public final String getMascota(){
        return mascota;
    }

    public void setNumPatas(int nnp){
        numpatas = nnp;
    }

    public void imprimir(){
        System.out.println("Mascota Nombre: " + mascota +
                " Num patas: " + numpatas);
    }

    public abstract void idioma();



}
