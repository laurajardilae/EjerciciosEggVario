import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    public Persona crearPersona()throws PersonaException{ //poner aca la excepcion
        Scanner entrada=new Scanner(System.in).useDelimiter("\n");
        try{
            System.out.println("Ingrese su nombre");
            String nombre = entrada.next();
            if(nombre.isEmpty()){
                throw new PersonaException("Campo nombre vacio");
            }
            System.out.println("Ingrese su edad");
            Integer edad= Integer.parseInt(entrada.next());
            if(edad == null){
                throw new PersonaException("Campo edad vacio");
            }
            String sexo;
            boolean sexoCorecto;
            do {
                System.out.println("Ingrese su sexo (M/H/O)");
                sexo = entrada.next().toUpperCase();
                sexoCorecto=sexo.equals("M")||sexo.equals("H")||sexo.equals("O");
                if(!sexoCorecto){
                    System.out.println("Ingrese el sexo nuevamente");
                }
            }while (!sexoCorecto);
            System.out.println("Ingrese su altura");
            Double altura = entrada.nextDouble();
            if(altura == null){
                throw new PersonaException("Campo altura vacio");
            }
            System.out.println("Ingrese su peso");
            Double peso= entrada.nextDouble();
            if(peso == null){
                throw new PersonaException("Campo peso vacio");
            }
            return new Persona(nombre,edad,sexo,altura,peso);
        }catch (PersonaException e){//atrapo
            throw e;//lanzo
        }

    }

    public Persona crearPersona2()throws PersonaException{ //poner aca la excepcion
        Scanner entrada=new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese su nombre");
        String nombre = entrada.next();
        if (nombre.isEmpty()) {
            throw new PersonaException("Campo nombre vacio");
        }
        System.out.println("Ingrese su edad");
        Integer edad = Integer.parseInt(entrada.next());
        if (edad == null) {
            throw new PersonaException("Campo edad vacio");
        }
        String sexo;
        boolean sexoCorecto;
        do {
            System.out.println("Ingrese su sexo (M/H/O)");
            sexo = entrada.next().toUpperCase();
            sexoCorecto = sexo.equals("M") || sexo.equals("H") || sexo.equals("O");
            if (!sexoCorecto) {
                System.out.println("Ingrese el sexo nuevamente");
            }
        } while (!sexoCorecto);
        System.out.println("Ingrese su altura");
        Double altura = entrada.nextDouble();
        if (altura == null) {
            throw new PersonaException("Campo altura vacio");
        }
        System.out.println("Ingrese su peso");
        Double peso = entrada.nextDouble();
        if (peso == null) {
            throw new PersonaException("Campo peso vacio");
        }
        return new Persona(nombre, edad, sexo, altura, peso);


    }


}
