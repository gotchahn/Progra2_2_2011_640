/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstracto;

/**
 *
 * @author Carlos Gochez
 */
public abstract class Gato extends Animal{
    public Gato(String m){
        super(m,4);
    }

    public void idioma(){
        System.out.println("Miu miauu miauuu");
    }
}
