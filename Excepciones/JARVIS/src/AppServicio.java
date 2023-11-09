import java.util.Scanner;

public class AppServicio {
    private Armadura armadura = new Armadura("Rojo", "Dorado", "1000");
    private Jarvis jarvis = new Jarvis(armadura);
    public void ejecutar(){
        acciones();
    }
    public void acciones(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int opc;
        int tiempoAux=0;
        do {
            System.out.println("Seleccione una acción");
            System.out.println("1. Caminar");
            System.out.println("2. Correr");
            System.out.println("3. Propulsarse");
            System.out.println("4. Volar");
            System.out.println("5. Atacar");
            System.out.println("6. Escribir");
            System.out.println("7. Hablar");
            System.out.println("8. Ver estado general");
            System.out.println("9. Ver porcentaje bateria");
            System.out.println("10. Entrar en modo reparación");
            opc = Integer.parseInt(scanner.next());
            if(opc<5){
                System.out.println("Ingrese el tiempo que ejecutó la acción:");
                tiempoAux = Integer.parseInt(scanner.next());
            }

            switch (opc){
                case 1:
                    armadura.caminar(tiempoAux);
                    break;
                case 2:
                    armadura.correr(tiempoAux);
                    break;
                case 3:
                    armadura.propulsarse(tiempoAux);
                    break;
                case 4:
                    armadura.volar(tiempoAux);
                    break;
                case 5:
                    armadura.atacar(tiempoAux);
                    break;
                case 6:
                    armadura.escribir();
                    break;
                case 7:
                    armadura.hablar(tiempoAux);
                    break;
                case 8:
                    jarvis.estadoGeneral();
                    break;
                case 9:
                    jarvis.verEstadoBateria();
                    break;
                case 10:
                    jarvis.modoReparacion();
            }
        }while(opc!=0);
    }

}
