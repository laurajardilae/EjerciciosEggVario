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
public class Generador {
    private final Float cargaMaxima = Float.MAX_VALUE;
    protected Float cargaActual ;
    public Generador() {
    }

    public Generador(Float cargaActual) {
        this.cargaActual = cargaActual;
    }

    public Float getCargaMaxima() {
        return cargaMaxima;
    }


    public Float getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(Float cargaActual) {
        this.cargaActual = cargaActual;
    }
    
    public void disminuirCargaActual(Float consumo){
        this.cargaActual -= consumo; 
    }

    @Override
    public String toString() {
        return "Generador{" + "cargaMaxima=" + cargaMaxima + ", cargaActual=" + cargaActual + '}';
    }
        
}
