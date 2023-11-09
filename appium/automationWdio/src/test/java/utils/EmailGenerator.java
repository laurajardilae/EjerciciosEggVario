package utils;

import java.util.Random;

public class EmailGenerator {


    public EmailGenerator() {
    }
    public String emailRandomGenerator(){
        Random random = new Random();
        String caracteres = "qwertyuiopasdfghjklzxcvbnm01234567890";
        String persona = "";
        for (int i = 0; i < 11; i++) {
            int indiceAleatorio = random.nextInt(0,caracteres.length());
            persona += caracteres.substring(indiceAleatorio,indiceAleatorio+1);
        }
        String organizacionEmail[] = {"gmail", "hotmail", "outlook"};
        String organizacionAleatorio = organizacionEmail[random.nextInt(0,organizacionEmail.length)];
        return persona + "@" + organizacionAleatorio + ".com";
    }

}
