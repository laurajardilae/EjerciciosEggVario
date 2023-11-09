import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneradorTest {
    Generador generador;
    @BeforeEach
    public void setUp(){
        generador = new Generador();
    }



    @Test
    public void pruebaDisminuirCarga(){
        generador.disminuirCarga(1000f);
        assertEquals(10000000000f-1000, generador.getCargaActual());
    }

}