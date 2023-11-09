import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DispositivoTest {
    Dispositivo botaDerecha;
    @BeforeEach
    public void setUp(){
        botaDerecha = new Dispositivo(3500f, false, TipoDispositivo.BOTA, "BOTA DERECHA");
    }

    @Test
    public void pruebaUso(){
        assertEquals(35000, botaDerecha.usar(IntensidadUso.BASICO,10));
    }

}