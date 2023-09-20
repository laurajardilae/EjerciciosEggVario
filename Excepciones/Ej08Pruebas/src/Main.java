// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //este retorna 46
        //System.out.println(metodo());

        //este retorna 45
        System.out.println(metodo2());


    }
    private static int metodo() {
        int valor=0;
        try {
            valor = valor+1;
            valor = valor + Integer.parseInt ("42");
            valor = valor +1;
            System.out.println("Valor final del try:" + valor) ;
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch:" + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor) ;
        }
        valor = valor +1;
        System.out.println("Valor antes del return: " + valor) ;
        return valor;
    }
    private static int metodo2() {
        int valor=0;
        try{
            valor = valor + 1;
            valor = valor + Integer.parseInt ("W");
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor) ;
        } catch ( NumberFormatException e ) {
            valor = valor + Integer.parseInt ("42");
            System.out.println("Valor final del catch: " + valor) ;
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor) ;
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor) ;
        return valor;
    }

}