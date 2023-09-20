public class Dispositivo {
    private float consumoEnergia;
    private boolean estaDaniado;
    private boolean esArma;
    private TipoDispositivo tipoDispositivo;
    private boolean estaDetruido;

    public Dispositivo() {
    }

    public Dispositivo(float consumoEnergia, boolean estaDaniado, boolean esArma, TipoDispositivo tipoDispositivo, boolean estaDetruido) {
        this.consumoEnergia = consumoEnergia;
        this.estaDaniado = estaDaniado;
        this.esArma = esArma;
        this.tipoDispositivo = tipoDispositivo;
        this.estaDetruido = estaDetruido;
    }

    public float getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(float consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
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

    @Override
    public String toString() {
        return "Dispositivo{" +
                "consumoEnergia=" + consumoEnergia +
                ", estaDaniado=" + estaDaniado +
                ", esArma=" + esArma +
                ", tipoDispositivo=" + tipoDispositivo +
                ", estaDetruido=" + estaDetruido +
                '}';
    }
    
}
