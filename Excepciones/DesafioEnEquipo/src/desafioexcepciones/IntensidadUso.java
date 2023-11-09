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
public enum IntensidadUso {
    BASICO(1), NORMAL(2), INTENSIVO(3);

    private Integer multiplicador;

    IntensidadUso(Integer multiplicador) {
        this.multiplicador = multiplicador;
    }

    public Integer getMultiplicador() {
        return multiplicador;
    }
}