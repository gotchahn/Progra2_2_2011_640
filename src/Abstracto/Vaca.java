/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstracto;

/**
 *
 * @author Carlos Gochez
 */
public class Vaca extends Animal{
    public Vaca(){
        super("vaca",4);
    }

    @Override
    public void idioma() {
        System.out.println("Muuu Muuuu");
    }
}
