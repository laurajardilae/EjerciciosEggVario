public class Generador {
    private float cargaMaxima;
    private float cargaActual;

    public Generador() {
    }

    public Generador(float cargaMaxima, float cargaActual) {
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public float getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(float cargaActual) {
        this.cargaActual = cargaActual;
    }

    @Override
    public String toString() {
        return "Generador{" +
                "cargaMaxima=" + cargaMaxima +
                ", cargaActual=" + cargaActual +
                '}';
    }
    public void disminuirCargaActual(float cargaPerdida){
        cargaActual -= cargaPerdida;
    }
}
