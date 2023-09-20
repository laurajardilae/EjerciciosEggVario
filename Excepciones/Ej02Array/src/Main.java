import java.util.ArrayList;
import java.util.List;

/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).

 */
public class Main {
    public static void main(String[] args) {
        int lista[] = new int[3];
        lista[0]=1;
        try{
            for (int i = 0; i < 4; i++) {
                System.out.println(lista[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posición no encontrada");
        }
    }
}