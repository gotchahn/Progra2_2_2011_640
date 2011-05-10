/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstracto;

/**
 *
 * @author Carlos Gochez
 */
public class Granja {
    public static void main(String args[]){
        Animal a[] = new Animal[3];
        a[0] = new Perro("gucci");
        a[1] = new Chihuahua("Poli");
        a[2] = new Vaca();

        for(Animal am : a ){
            am.idioma();
        }

       // Gato g = new Gato("Misi");
    }
}
