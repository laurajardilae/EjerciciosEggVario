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
public class Dispositivo {
    public final Float consumoBase = 10000f;
    
    private String nombre;
    private boolean estaDaniado;
    private boolean esArma;
    private TipoDispositivo tipoDispositivo;
    private boolean estaDetruido;

    public Dispositivo() {
    }

    public Dispositivo(String nombre, boolean estaDaniado, boolean esArma, TipoDispositivo tipoDispositivo, boolean estaDetruido) {
        this.nombre = nombre;
        this.estaDaniado = estaDaniado;
        this.esArma = esArma;
        this.tipoDispositivo = tipoDispositivo;
        this.estaDetruido = estaDetruido;
    }
    
    public boolean isEstaDaniado() {
        return estaDaniado;
    }

    public void setEstaDaniado(boolean estaDaniado) {
        this.estaDaniado = estaDaniado;
    }

    public boolean isEsArma() {
        return esArma;
    }

    public void setEsArma(boolean esArma) {
        this.esArma = esArma;
    }

    public TipoDispositivo getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(TipoDispositivo tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public boolean isEstaDetruido() {
        return estaDetruido;
    }

    public void setEstaDetruido(boolean estaDetruido) {
        this.estaDetruido = estaDetruido;
    }
    
    public Float usar(IntensidadUso intensidadUso, Integer tiempo) {
        sufriendoDanios();
        return intensidadUso.getMultiplicador() * tiempo * this.consumoBase;
    }
    
    public void sufriendoDanios(){
        this.estaDaniado = Math.random() <= 0.3;
    }
    
    public void repararDanios(){
        this.estaDaniado = Math.random() <= 0.6;
        if(this.estaDaniado)
            this.estaDetruido = Math.random() <= 0.3;
    }
    
@Override
    public String toString() {
        return "Dispositivo{" +
                " nombre= " + nombre +
                ", estaDaniado=" + estaDaniado +
                ", esArma=" + esArma +
                ", tipoDispositivo=" + tipoDispositivo +
                ", estaDetruido=" + estaDetruido +
                '}';
    }
}
