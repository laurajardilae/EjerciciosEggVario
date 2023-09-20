import java.util.Random;
import java.util.Scanner;

/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
public class Main {
    public static void main(String[] args) {
        play();
    }
    public static void play(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int numSecreto = random.nextInt(500), numUsu=0;
        int intentos = 0;

        System.out.println(numSecreto);

        do {
            intentos++;
            try{
                System.out.println("Ingrese un numero:");
                numUsu = Integer.parseInt(scanner.next());
                if(numUsu>numSecreto){
                    System.out.println("Tu numero es muy grande");
                } else if (numUsu<numSecreto) {
                    System.out.println("Tu numero es muy chico");
                }else {
                    System.out.println("Ganaste");
                }
            }catch (NumberFormatException e){
                System.out.println("Eso no es un numero");
            }
            System.out.printf("Llevas %d intento(s)\n_____________________\n", intentos);
        }while (numUsu!=numSecreto);

    }
}