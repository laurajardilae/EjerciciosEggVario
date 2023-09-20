package Entidad;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double altura;
    private double peso;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularIMC(){
        double IMC = peso/(Math.pow(altura,2));
        System.out.println("El índice IMC es de:"+IMC);
        int resultado=0;
        if(IMC<20){
            resultado=-1;
        } else if (IMC>20&&IMC<25) {
            resultado =0;
        } else if (IMC>25) {
            resultado=1;
        }
        return resultado;
    }
    public boolean esMayorDeEdad(){
        boolean mayor;
        if(edad>=18){
            System.out.println("Es mayor de edad");
            return true;
        } else  {
            System.out.println("Es menor de edad");
            return false;
        }
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
