/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioexcepciones;

/**
 *
 * @author Juan
 */
public class ServicioJARVIS {
    private Armadura armadura;

    public ServicioJARVIS(Armadura armadura) {
        this.armadura = armadura;
    }
    
    /*
    Crear armadura metodo manual
    public void crearArmadura(){}
    */
    
    public void mostrarEstados(){
        //Info de los estados de todos los dispositivos y de la armadura
        armadura.mostrarDispositivos();
        armadura.toString();
    }
    
    public void mostrarEstadoGenerador(){
        armadura.generador.toString();
    }
    
    public void revisarDispositivos(){
        
        for (Dispositivo dispositivo : armadura.getListaDispositivos()) {
            if(dispositivo.isEstaDaniado())
                do{
                    dispositivo.repararDanios();
                }while(dispositivo.isEstaDaniado() && dispositivo.isEstaDetruido());
        }
    }
}
