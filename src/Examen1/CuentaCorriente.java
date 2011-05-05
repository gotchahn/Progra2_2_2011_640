/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Examen1;

/**
 *
 * @author Carlos Gochez
 */
public class CuentaCorriente extends Cuenta{
    private boolean isActiva;
    private Transaccion libreta[];

    public CuentaCorriente(String n,int c){
        super(n,c);
        isActiva = true;
        libreta = new Transaccion[200];
    }


    public void hacerDeposito(Transaccion t){
        hacerDeposito(t,0);
    }

    private void hacerDeposito(Transaccion t, int pos) {
        if( pos < libreta.length ){
            if( libreta[pos] == null ){
                //vacia
                if( t.tipoTrans == 'D' )
                    libreta[pos] = t;
            }
            else{
                hacerDeposito(t,pos+1);
            }
        }
    }


    @Override
    public double registrarIntereses(){
        double aum = 0;
        if( isActiva ){
            aum = super.registrarIntereses();
        }
        return aum;
    }

    public double saldoEnLibros(){
        return saldoEnLibros(0);
    }

    private double saldoEnLibros(int pos) {
        if( pos < libreta.length ){
            if( libreta[pos] != null ){
                if( libreta[pos].tipoTrans == 'D' )
                    return saldoEnLibros(pos+1) +
                            libreta[pos].monto;
                else
                    return saldoEnLibros(pos+1) -
                            libreta[pos].monto;
            }
        }
        return 0;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("activo: " + isActiva);

        for(Transaccion t : libreta){
            if( t != null )
                t.Imprimir();
        }

       /* for(int t=0; t < libreta.length; t++){
            if( libreta[t] != null )
                libreta[t].Imprimir();
        }*/

    }






}
