public class Jarvis {
    private Armadura armadura;

    public Jarvis() {

    }

    public Jarvis(Armadura armadura) {
        this.armadura = armadura;
    }

    public void estadoGeneral() {
        for (Dispositivo d: armadura.getDispositivos()             ) {
            System.out.println(d.toString());
        }
    }

    public void verEstadoBateria() {
        System.out.println("El porcentaje de batería es: " + calcularPorcentajeBateria());
    }
    public Float calcularPorcentajeBateria(){
        return (armadura.getGenerador().getCargaActual())*100/armadura.getGenerador().getCargaMaxima();
    }
    public void modoReparacion(){
        for (Dispositivo d: armadura.getDispositivos()             ) {
            d.reparar();
        }
        System.out.println("Se finalizó el modo reparación, algunos dispositivos puede que hayan quedado destruidos...");
        //ya no debería haber ninguno dañado, o arreglado o destruido
        estadoGeneral();
    }
}
