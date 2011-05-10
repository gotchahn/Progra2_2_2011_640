/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstracto;

/**
 *
 * @author Carlos Gochez
 */
public class Perro extends Animal {
    public Perro(String m){
        super(m,4);
    }

    public void idioma(){
        System.out.println("guau gua gua gauu");
    }
}
