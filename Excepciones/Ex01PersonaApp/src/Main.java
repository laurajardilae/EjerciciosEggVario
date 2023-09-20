// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();

        try {
            Entidad.Persona p = ps.crearPersona();
        }catch (PersonaException e){
            System.out.println(e.getMessage());
        }

    }
}