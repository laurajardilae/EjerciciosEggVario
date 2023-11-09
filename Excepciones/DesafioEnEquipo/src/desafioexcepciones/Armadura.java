/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioexcepciones;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Armadura {
    protected String colorPrimario, colorSecundario, nivelResistencia;
    protected Integer nivelSalud;
    protected Generador generador;
    protected Dispositivo guanteDer, guanteIzq, botaDer, botaIzq, consola, sintetizador;
    protected ArrayList<Dispositivo> listaDispositivos;
    
    public Armadura() {
        this.botaDer = new Dispositivo();
        this.generador = new Generador(); 
        this.guanteDer = new Dispositivo();
        this.guanteIzq = new Dispositivo();
        this.botaDer = new Dispositivo();
        this.botaIzq = new Dispositivo();
        this.consola = new Dispositivo();
        this.sintetizador = new Dispositivo();
        listaDispositivos.add(this.botaDer);
        listaDispositivos.add(this.botaIzq);
        listaDispositivos.add(this.guanteDer);
        listaDispositivos.add(this.guanteIzq);
        listaDispositivos.add(this.consola);
        listaDispositivos.add(this.sintetizador);
    }

    public Armadura(String colorPrimario, String colorSecundario, String nivelResistencia, Integer nivelSalud, Generador generador, Dispositivo guanteDer, Dispositivo guanteIzq, Dispositivo botaDer, Dispositivo botaIzq, Dispositivo consola, Dispositivo sintetizador) {
        this();
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = nivelSalud;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public String getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(String nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public Integer getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(Integer nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public Dispositivo getGuanteDer() {
        return guanteDer;
    }

    public void setGuanteDer(Dispositivo guanteDer) {
        this.guanteDer = guanteDer;
    }

    public Dispositivo getGuanteIzq() {
        return guanteIzq;
    }

    public void setGuanteIzq(Dispositivo guanteIzq) {
        this.guanteIzq = guanteIzq;
    }

    public Dispositivo getBotaDer() {
        return botaDer;
    }

    public void setBotaDer(Dispositivo botaDer) {
        this.botaDer = botaDer;
    }

    public Dispositivo getBotaIzq() {
        return botaIzq;
    }

    public void setBotaIzq(Dispositivo botaIzq) {
        this.botaIzq = botaIzq;
    }

    public Dispositivo getConsola() {
        return consola;
    }

    public void setConsola(Dispositivo consola) {
        this.consola = consola;
    }

    public Dispositivo getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Dispositivo sintetizador) {
        this.sintetizador = sintetizador;
    }

    public ArrayList<Dispositivo> getListaDispositivos() {
        return listaDispositivos;
    }
    
    
    /*
    En esta primera etapa con una armadura podremos: 
    caminar, correr, propulsar, volar, escribir y leer.
    */
    
    
    
    public void caminar(Integer segundos){
        //Del generador obtengo la energia
        generador.disminuirCargaActual(botaDer.usar(IntensidadUso.BASICO,segundos));
        generador.disminuirCargaActual(botaIzq.usar(IntensidadUso.BASICO,segundos));
   
    }
    
    public void correr (Integer segundos){
        generador.disminuirCargaActual(botaDer.usar(IntensidadUso.NORMAL,segundos));
        generador.disminuirCargaActual(botaIzq.usar(IntensidadUso.NORMAL,segundos));
    }
    
    public void propulsarse(Integer segundos){
        generador.disminuirCargaActual(botaDer.usar(IntensidadUso.INTENSIVO,segundos));
        generador.disminuirCargaActual(botaIzq.usar(IntensidadUso.INTENSIVO,segundos));
    }
    
    public void volar(Integer segundos){
        propulsarse(segundos);
        generador.disminuirCargaActual(guanteDer.usar(IntensidadUso.NORMAL, segundos));
        generador.disminuirCargaActual(guanteIzq.usar(IntensidadUso.NORMAL, segundos));
    }
    
    public void atacar(Integer tiempoDisparo){
        generador.disminuirCargaActual(guanteDer.usar(IntensidadUso.INTENSIVO, tiempoDisparo));
        generador.disminuirCargaActual(guanteIzq.usar(IntensidadUso.INTENSIVO, tiempoDisparo));
    }
    
    public void hablar(){
        generador.disminuirCargaActual(sintetizador.usar(IntensidadUso.BASICO, 1));
    }
    
    public void escribir(){
        generador.disminuirCargaActual(consola.usar(IntensidadUso.BASICO, 1));
    }
    
    public void mostrarDispositivos(){
        System.out.println("Estado de los dispositivos:");
        System.out.println(guanteDer.toString());
        System.out.println(guanteIzq.toString());
        System.out.println(botaDer.toString());
        System.out.println(botaIzq.toString());
        System.out.println(sintetizador.toString());
        System.out.println(consola.toString());
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", nivelResistencia=" + nivelResistencia + ", nivelSalud=" + nivelSalud + generador.toString() + '}';
    }
    
    
}
