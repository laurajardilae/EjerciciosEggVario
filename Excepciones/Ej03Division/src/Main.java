import java.util.Scanner;

/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
public class Main {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        try {
            String a = scan.next();
            String b = scan.next();

            int a1 = Integer.parseInt(a);
            int b1 = Integer.parseInt(b);

            DivisionNumero dv = new DivisionNumero();

            System.out.println(dv.dividir(a1,b1));
        }catch (NumberFormatException e){
            System.out.println("Al menos uno de los valores ingresados no es un numero");
            ejecutar();
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
            ejecutar();
        }
    }
}